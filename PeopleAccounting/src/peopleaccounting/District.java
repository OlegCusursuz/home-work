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
public enum District {
    School6("School6"),
    Deacon("Deacon"),
    Pastor("Pastor");
    
    private final String name;
    
    private District(String name){
        this.name = name;
    }
    
    public static District getByDistrictName(String districtName){
        for (District dis : District.values()){
            if (dis.name.equals(districtName)){
                return dis;
            }
        }
        throw new IllegalArgumentException("position does exist in the enum");
    }
    
    @Override
    public String toString(){
      return name;  
    }
    
    
    
    
}
