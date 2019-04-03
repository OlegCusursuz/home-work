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
public class Horse {
    private final String name = "Sonia";
    private int age = 4;
    private boolean job;
    boolean owner;
    
    private void getName(){
        System.out.println(name);
    }

    public Horse(boolean owner) {
        this.owner = owner;
    }
    
    private void job(){
        if(age<10){
            job = true;
            System.out.println(job);
        }else if(age<5){
            job = true;
            System.out.println(job);
        }else if(age<1){
            job = false;
            System.out.println(job);
        }
        
    }

    public Horse() {
    job();
    getName();
    }
    
    
    
}
