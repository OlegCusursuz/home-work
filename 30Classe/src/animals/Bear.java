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
public class Bear {
    String name = "Misha";
    String breed = "Formosan black bear";
    int speed = 40;
    String weight;
    
    private void dieta(){
        System.out.println("They feed primarily on leaves, buds, fruits, roots");
    }
    public void show(){
        System.out.println("Name"+name+"\nBreed"+breed+"\nSpeed"+speed);
    }
    Bear(){
        dieta();
        show();
    }
    Bear(String weight){
        this.weight = weight;
        System.out.println(this.weight);
    }
    
}
