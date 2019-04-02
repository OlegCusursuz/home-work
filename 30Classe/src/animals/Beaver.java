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
public class Beaver {

    private final String name = "Borea";
    private int age = 6;
    boolean family;
    int dam;

    public Beaver(boolean famyli) {
        this.family = famyli;
    }

    public void getName() {
        System.out.println(name);
    }

    public void dam() {
        if (age > 4) {
            if (age > 8) {
                dam = 9;
                System.out.println(dam);
            }
        }
        System.out.println(dam);
    }

    public Beaver() {
        getName();
        dam();
    }
    
    

}
