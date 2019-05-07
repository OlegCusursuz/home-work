/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author kusur
 */
public class CustomerDAO {

    static Connection conn;
    static PreparedStatement pst;
    

    public static int insertCustomer(CustomerBean u) {
        int status = 0;
        try {
            conn = ConnectionProvider.getCon();
            pst = conn.prepareStatement("INSERT INTO app.employee(name, surname, position, birthday, adres)  VALUES (?,?,?,?,?)");
            pst.setString(1, u.getName());
            pst.setString(2, u.getSurname());
            pst.setString(3, u.getPosition());
            pst.setString(4, u.getLdBirthday());
            pst.setString(5, u.getAdres());
            status = pst.executeUpdate();
            conn.close();
            System.out.println(String.format("Executed insert statement. Affected %d rows", status));

        } catch (Exception e) {
            System.out.println("insertCustomer " + e);
        }
        return status;
    }
    
    public static int getAll(){
        int status =0;
        try (Connection conn = ConnectionProvider.getCon();
                Statement dbStatement = conn.createStatement();
                ResultSet rs = dbStatement.executeQuery("SELECT name, surname, position, birthday, adres FROM app.employee")){
          while (rs.next()) {
                 CustomerBean cust = new CustomerBean(
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("position"),
                        rs.getString("birthday"),
                        rs.getString("adres"));
                 
                
            }
        
            
        } catch (Exception e) {
        }
        
        
        return status;
    }
}
