/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syerrabeyts;

/**
 *
 * @author kusur
 */
public class SympleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "neudacia";
        if(result.equals("popal")){
            testResult = "proiden";
        }
        System.out.println(testResult);
            
    }
    
}
