/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleaccounting;

/**
 *
 * @author kusur
 */
public enum Position {
    ChurchMember("Church member"),
    Deacon("Deacon"),
    Pastor("Pastor");
    
    final String name;
    
    private Position(String name){
        this.name = name;
    }
    
    public static Position getByPositionName(String positionName){
        for (Position pos : Position.values()){
            if (pos.name.equals(positionName)){
                return pos;
            }
        }
        throw new IllegalArgumentException("position does exist in the enum");
    }
    
    @Override
    public String toString(){
      return name;  
    }
    
    
    
    
}
