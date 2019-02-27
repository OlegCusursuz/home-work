/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson15;

/**
 *
 * @author kusur
 */
public class Tehnician extends Data {

    public Tehnician() {

    }

    public Tehnician(String name) {
        this.name = name;
    }

    public Tehnician(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Tehnician(int numberBloc, int numberApartoment) {
        this.numberBloc = numberBloc;
        this.numberApartoment = numberApartoment;
    }

    public Tehnician(String name, String surName, int id, String streat, int birthYear, int numberApartoment, int numberBloc) {
        this.name = name;
        this.surname = surName;
        this.id = id;
        this.streat = streat;
        this.birthYear = birthYear;
        this.numberApartoment = numberApartoment;
        this.numberBloc = numberBloc;
    }

    @Override
    public void Shou() {
        System.out.println("Tehnician:");
        super.Shou();
      
    }

}
