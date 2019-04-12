
package newpackage;

import java.time.LocalDate;

public class Employee {

    private Integer id;
    private String adres;
    private String name;
    private String surname;
    protected Position position;
    private LocalDate ldBirthday;

    public Employee(String name, String surname, LocalDate ldBirthday, String adres) {
        this.name = name;
        this.surname = surname;
        this.adres = adres;
        this.ldBirthday = ldBirthday;
    }

    public Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Employee(int aInt, String string, String string0, Position byPositionName,String ldBirthday,String adres) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LocalDate getLDBirthDay() {
        return ldBirthday;
    }

    public String getAdres() {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAdres(String adres) {
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
    
    public void setLDBirthDay(LocalDate birthday){
        this.ldBirthday =  birthday;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + surname + "," + position + "," + ldBirthday+","+adres;
    }

}
