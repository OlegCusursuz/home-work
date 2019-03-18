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
public class Kangaroo {

    String name = "Danil";
    boolean jock;
    int age = 4;

    void jock() {
        if(age > 3) {
            jock = true;
        } else {
            jock = false;
        }

    }
    void show(){
        System.out.println("Name "+name+"\nAge"+age);
    }

    public Kangaroo() {
        if(jock){
            System.out.println("Kangaroo jock");
        }else{
            System.out.println("small kangaroo ");
        }
    }

    public Kangaroo(boolean jock) {
        this.jock = jock;
    }
    
    
    
}
