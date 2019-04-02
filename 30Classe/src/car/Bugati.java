/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author kusur
 */
public class Bugati {
    int motor;
    String color;
    int spead;
    boolean taxi;

    public Bugati(int motor, String color, int spead, boolean taxi) {
        this.motor = motor;
        this.color = color;
        this.spead = spead;
        this.taxi = taxi;
    }

    public void motor() {
        if (motor == 5.7) {
            spead = (int) 3.2;
        } else if (motor == 6.3) {
            spead = (int) 2.7;
        }
    }

    public void taxi() {
        taxi = "yellow".equals(color);
    }
}
