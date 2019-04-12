
package EmployeeService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import newpackage.Employee;

public class EmployeeService {
    private static EmployeeDao empDao = new EmployeeDao();



    public static Employee getById(Integer id) {
        return null;
    }

    public static void edit(Integer employeeId, String newName, String newSurname, String newPosition, String birthday, String adres) {
    }
    

    public static ArrayList<Employee> getAll() throws SQLException {
        return empDao.getAll();
    }

    public static Employee getByParams(String... params) {
       return empDao.getEmployee(params[0], params[1], params[2], params[3], params[4]);
       
    }

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    public static void add(Employee emp){
        empDao.add(emp);
    }
    
    public static void serializeSQL() throws SQLException{
                empDao.getAll();
    }
    
    public static void serializeXML() throws ParserConfigurationException, TransformerException{
       
        
    }
    public static void inputDemo() throws ParserConfigurationException, TransformerException {
        

    }

    public static void outputDemo() throws FileNotFoundException, ClassNotFoundException {
        try {
            deserializeFromFile("C:\\abc\\EmployeesHR.txt");
        } catch (IOException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void serializeToFile(ArrayList<Employee> empList, String filePath) throws FileNotFoundException, IOException {
        File outputFile = new File(filePath);
        FileOutputStream fileOutStream = new FileOutputStream(outputFile);
        PrintWriter printWriter = new PrintWriter(fileOutStream);
        for (Employee emp : empList) {
            printWriter.println(emp);
        }
        printWriter.flush();
        fileOutStream.close();
        printWriter.close();
    }

    public static void deserializeFromFile(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileReader fileReader = new FileReader(new File(filePath));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileLine;
        ArrayList<String> newEmployeeList = new ArrayList<>();
        while ((fileLine = bufferedReader.readLine()) != null) {
            for (String string : fileLine.split(",")) {
                System.out.println(string);
                for (int index = 0; index < newEmployeeList.size(); index++) {
                    newEmployeeList.set(index, string);
                }
            }

        }
    }

    

    }


