/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notebook;

/**
 *
 * @author kusur
 */
public class Lenovo {
    boolean touchDisplay;
    int diagonal;
    String cpu;
    boolean game;

    public Lenovo( int diagonal, String cpu) {
        this.diagonal = diagonal;
        this.cpu = cpu;
    }
    
    public void diagonal() {
        touchDisplay = diagonal > 13;
    }
    
    public void cpu(){
        game = "Intel CORE i9".equals(cpu);
    }

    public Lenovo() {
        System.out.println("game = "+game);
    }
    
}
