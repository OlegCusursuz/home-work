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
public class Lada {
    int motor;
    String color;
    boolean automaticTransmission;
    boolean taxi;

    public Lada(int motor, String color, boolean transmission, boolean taxi) {
        this.motor = motor;
        this.color = color;
        this.automaticTransmission = transmission;
        this.taxi = taxi;
    }

    public void fuel() {
        if (motor == 2.0) {
            automaticTransmission = true;
        } else if (motor == 1.8) {
            automaticTransmission = false;
        }
    }

    public void taxi() {
        taxi = "yellow".equals(color);
    }
}
