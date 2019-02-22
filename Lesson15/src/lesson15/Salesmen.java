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

    void SalesmenName() {
        System.out.println("Name: " + this.name);
    }

    public Salesmen(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    void SalesmenNameDirthYear() {
        System.out.println("Name: " + this.name + " Birth Year: " + this.birthYear);
    }

    public Salesmen(int numberBloc, int numberApartoment) {
        this.numberBloc = numberBloc;
        this.numberApartoment = numberApartoment;
    }

    void SalesmenNumberBloocNumberApartiment() {
        System.out.println("Number bloc: " + this.numberBloc + " Number apartoment: " + this.numberApartoment);
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

    void SalesmenNameSurnameId() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " ID: " + this.id + " Streat: " + this.streat + " Birth Year: " + this.birthYear + " Number apartoment: " + this.numberApartoment + " Number bloc: " + this.numberBloc);
    }

    public void Shou() {
        System.out.println("Salesmen:");
        this.SalesmenName();
        this.SalesmenNameDirthYear();
        this.SalesmenNameSurnameId();
        this.SalesmenNumberBloocNumberApartiment();
        System.out.println("");
    }

}
