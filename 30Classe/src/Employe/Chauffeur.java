/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;

/**
 *
 * @author kusur
 */
public class Chauffeur {
    String[] Employee = new String[]{"bookkeeper", "builder", "chauffeur", "dentist", "meneger", "programmer"};
    private String tool;
    private String name;
    int salary;

    public Chauffeur(String tool, String name) {
        this.tool = tool;
        this.name = name;
    }

    private void getName() {
        System.out.println("Name " + this.name);
    }

    private void getTool() {
        System.out.println("Tool " + this.tool);
    }

    private void salary() {
        for (String employee : Employee) {
            switch (employee) {
                case "bookkeeper":
                    salary = 10_000;
                    break;
                case "builder":
                    salary = 5_000;
                    break;
                case "chauffeur":
                    salary = 6_000;
                    break;
                case "dentist":
                    salary = 15_000;
                    break;
                case "meneger":
                    salary = 10_000;
                    break;
                case "programmer":
                    salary = 15_000;
                    break;
                    
            }
        }
    }

    public Chauffeur() {
        getName();
        getTool();
        salary();
    }

}
