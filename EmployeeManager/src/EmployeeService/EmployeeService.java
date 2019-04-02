/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeService;

import java.util.ArrayList;
import newpackage.Employee;
import newpackage.Position;

public class EmployeeService {

    private static final ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public static ArrayList<Employee> getEmployeeList() {
        return EMPLOYEE_LIST;
    }

    public static Employee getById(Integer id) {
        for (Employee emp : EMPLOYEE_LIST) {
            if (emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }

    public static void edit(Integer employeeId, String newName, String newUsername, String newPosition, String newDay, String newMonth, String newYear, String newAdres) {
        int index;
        for (index = 0; index < EMPLOYEE_LIST.size(); index++) {
            if (employeeId.equals(EMPLOYEE_LIST.get(index).getId())) {
                break;
            }

        }
        EMPLOYEE_LIST.get(index).setName(newName);
        EMPLOYEE_LIST.get(index).setSurname(newUsername);
        EMPLOYEE_LIST.get(index).setDay(newDay);
        EMPLOYEE_LIST.get(index).setMonth(newMonth);
        EMPLOYEE_LIST.get(index).setYear(newYear);
        EMPLOYEE_LIST.get(index).setAdres(newAdres);
        EMPLOYEE_LIST.get(index).setPosition(Position.getByPositionName(newPosition));

    }

    public static void delete(Integer employeeId) {
        int index;
        for (index = 0; index < EMPLOYEE_LIST.size(); index++) {
            if (employeeId.equals(EMPLOYEE_LIST.get(index).getId())) {
                break;
            }

        }
        EMPLOYEE_LIST.remove(index);

        for (; index < EMPLOYEE_LIST.size(); index++) {
            EMPLOYEE_LIST.get(index).setId(employeeId++);
        }

    }

}
