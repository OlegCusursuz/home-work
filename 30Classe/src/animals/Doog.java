/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author kusur
 */
public class Doog {

    String name = "Jucika";
    String sweet = "8/10";
    int age = 2;

    void show() {
        System.out.println("Name" + name + "Sweet" + sweet + "Age" + age);
    }

    void run() {
        if (age < 1) {
            System.out.println("Sleep");
            sweet = "10/10";
        } else {
            System.out.println("RUUUUUUN");
            sweet = "7/10";
        }
    }

    Doog() {
        show();
        run();
    }

    Doog(boolean home) {
        if (home) {
            System.out.println("Dog in home");
        } else {
            System.out.println("Dog on the street");
        }
    }

}
