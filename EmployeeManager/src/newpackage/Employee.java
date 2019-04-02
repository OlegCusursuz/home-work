/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


public class Employee {

    private Integer id;
    private String day;
    private String month;
    private String year;
    private String adres;
    private String name;
    private String surname;
    protected Position position;
    

    public Employee(String name, String surname, String day, String month,String year, String adres) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.adres = adres;
    }

    public Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public String getYear(){
        return year;
    }
    
    public String getAdres(){
        return adres;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Position getPosition() {
        return position;
    }

    public Integer getId() {
        return id;
    }

    public void setDay(String Day){
        this.day = Day; 
    }
    public void setMonth(String month){
        this.month = month;
    }
    public void setYear(String year){
        this.year = year;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setAdres(String adres){
        this.adres = adres;
    }

    public boolean isValid() {
        return !this.name.isEmpty();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "\n"+"Employee{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", Birth day :"+day+month+year+", position=" + position + '}';
    }
    
    

}