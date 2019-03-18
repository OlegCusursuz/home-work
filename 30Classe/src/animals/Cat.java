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
public final class Cat {

    String name = "Murzic";
    String sweet = "9/10";
    int age = 3;

    void show() {
        System.out.println("Name" + name + "Sweet" + sweet + "Age" + age);
    }

    void run() {
        if (age > 2) {
            System.out.println("Sleep");
            sweet = "10/10";
        } else {
            System.out.println("RUUUUUUN");
            sweet = "6/10";
        }
    }

    Cat() {
        show();
        run();
    }

    Cat(boolean home) {
        if(home){
            System.out.println("Cat in home");
        }else{
            System.out.println("Cat on the street");
        }
    }
}
