/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author kusur
 */
public enum Position {
    Programmer("Programmer"),
    Accountant("Accountant"),
    HRManager("HR Manager"),
    Cleaner("Cleaner");
    
    private String naem;
    
    private Position(String name){
        this.naem = name;
    }
    
    public static Position getByPositionName(String positionName){
        for (Position pos : Position.values()){
            if (pos.naem.equals(positionName)){
                return pos;
            }
        }
        throw new IllegalArgumentException("position does exist in the enum");
    }
    
    
    
    
}
