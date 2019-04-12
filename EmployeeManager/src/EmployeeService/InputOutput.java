/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import newpackage.Employee;

/**
 *
 * @author kusur
 */
public class InputOutput {
    private static final ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public static void inputDemo() {

        try {
            serializeToFile(EMPLOYEE_LIST, "C:\\abc\\EmployeesHR.txt");
        } catch (IOException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void outputDemo() throws FileNotFoundException, ClassNotFoundException{
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
        while ((fileLine = bufferedReader.readLine()) != null) {
            System.out.println(fileLine);
        }
    }
    
}
