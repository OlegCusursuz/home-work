/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeService;

import java.util.ArrayList;
import newpackage.Employee;

public class EmployeeService {

    private static final ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();
    
   
    public static ArrayList<Employee> getEmployeeList(){
    return EMPLOYEE_LIST;
    }
}
