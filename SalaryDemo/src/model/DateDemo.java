/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;


public class DateDemo {

    public static void main(String[] args) {
        Map<Integer, EmployeeCustom> map = new HashMap<>();
        EmployeeCustom emp = new EmployeeCustom(1, "Jake");
        map.put(emp.id, emp);
        map.get(1);
    }

}

class EmployeeCustom {
    
    int id;
    String name;
    ///

    public EmployeeCustom(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    
}
