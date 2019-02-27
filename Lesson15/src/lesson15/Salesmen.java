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
public class Salesmen extends Data {

    public Salesmen() {

    }

    public Salesmen(String name) {
        this.name = name;
    }

    public Salesmen(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Salesmen(int numberBloc, int numberApartoment) {
        this.numberBloc = numberBloc;
        this.numberApartoment = numberApartoment;
    }

    public Salesmen(String name, String surName, int id, String streat, int birthYear, int numberApartoment, int numberBloc) {
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
        System.out.println("Salesmen:");
        super.Shou();
        
    }

}
