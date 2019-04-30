/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import newpackage.Employee;
import newpackage.Position;

/**
 *
 * @author kusur
 */
public class EmployeeDao {

    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/empMeneger";
    private static final String DB_USER = "postgres";
    private static final String DB_PASS = "root";

    public EmployeeDao() {

    }

    private Connection connect() throws SQLException {
        System.out.println("Connected to postgresql server successfully.");
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public ArrayList<Employee> getAll() throws SQLException {
        String sql = "SELECT id, name, surname, position, birthday, adres, idEmployee FROM app.employee";
        try (Connection conn = connect();
                Statement dbStatement = conn.createStatement();
                ResultSet rs = dbStatement.executeQuery(sql)) {
            ArrayList<Employee> empList = new ArrayList<>();
            while (rs.next()) {
                Employee emp = new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        Position.getByPositionName(rs.getString("position")),
                        rs.getString("birthday"),
                        rs.getString("adres"));
                empList.add(emp);
            }
            return empList;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to get all the employees");
            throw ex;
        }
    }

    public int add(Employee emp) {
        String insertSql = "INSERT INTO app.employee(name, surname, position, birthday, adres) VALUES (?,?,?,?,?)";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(insertSql)) {

            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setString(3, emp.getPosition().toString());
            dbStatement.setString(4, emp.getLDBirthDay().toString());
            dbStatement.setString(5, emp.getAdres());

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employee");
        }
        return -1;
    }

    public int add(ArrayList<Employee> empList) throws SQLException {
        String insertSql = "INSERT INTO app.employee(name,surname,position,birthday,adres) VALUES (?,?,?,?,?)";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(insertSql)) {

            for (Employee emp : empList) {
                dbStatement.setString(1, emp.getName());
                dbStatement.setString(2, emp.getSurname());
                dbStatement.setString(3, emp.getPosition().name());
                dbStatement.setString(4, emp.getLDBirthDay().toString());
                dbStatement.setString(5, emp.getAdres());
                dbStatement.addBatch();
            }

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }

    public int edit(Employee emp) throws SQLException {
        String updateSql = "UPDATE app.employee SET name=?, surname=?, position=?, birthday=?, adres=? WHERE id=?";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(updateSql)) {

            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setString(3, emp.getPosition().toString());
            dbStatement.setString(4, emp.getLDBirthDay().toString());
            dbStatement.setString(5, emp.getAdres());
            dbStatement.setInt(6, emp.getId());

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }

    public int remove(int idEmployee) throws SQLException {
        String updateSql = "DELETE FROM app.employee WHERE id=?";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(updateSql)) {

            dbStatement.setInt(1, idEmployee);
            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed delete statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to delete the employee");
            throw ex;
        }
    }

    public Employee getEmployee(String name, String surname, String position, String birthday, String adres) {
        String sql = "SELECT id, name, surname, position, birthday, adres FROM app.employee "
                + "WHERE name=? AND surname=? AND position=? AND birthday=? AND adres=?";
        try (Connection conn = connect(); PreparedStatement prepStmt = conn.prepareStatement(sql);ResultSet rs = prepStmt.executeQuery()) {
            prepStmt.setString(1, name);
            prepStmt.setString(2, surname);
            prepStmt.setString(3, position);
            prepStmt.setString(4, birthday);
            prepStmt.setString(5, adres);
            Employee emp = null;
            while (rs.next()) {
                emp = new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        Position.getByPositionName(rs.getString("position")),
                        rs.getString("birthday"),
                        rs.getString("adres"));
            }
            return emp;
        } catch (SQLException ex) {
            System.err.println("Error trying to get one employee");
        }
        return null;
    }
}
