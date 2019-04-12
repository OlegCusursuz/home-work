/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;


public class Employee implements Serializable{
    
    String name;
    String surname;
    LocalDate employeedOn;
    Integer age;

    public Employee(String name, String surname, LocalDate employeedOn, Integer age) {
        this.name = name;
        this.surname = surname;
        this.employeedOn = employeedOn;
        this.age = age;
    }
    
    public static Employee getRandomEmployee(){
        Random rnd = new Random();
        int randValue = rnd.nextInt();
        return new Employee("name" + randValue, "surname" + randValue, LocalDate.now(), randValue);
    }

    @Override
    public String toString() {
        return name + "," + surname + "," + employeedOn + "," + age ;
    }
    
}
