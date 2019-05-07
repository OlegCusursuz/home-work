/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mit;


/**
 *
 * @author kusur
 */
public class CustomerBean {
    private String name;
    private String surname;
    private String position;
    private String ldBirthday;
    private String adres;
    
    public CustomerBean(String name,String surname, String position, String ldBirthday,String adres){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.ldBirthday = ldBirthday;
        this.adres = adres;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the ldBirthday
     */
    public String getLdBirthday() {
        return ldBirthday;
    }

    /**
     * @param ldBirthday the ldBirthday to set
     */
    public void setLdBirthday(String ldBirthday) {
        this.ldBirthday = ldBirthday;
    }

    /**
     * @return the adres
     */
    public String getAdres() {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(String adres) {
        this.adres = adres;
    }

    
}
