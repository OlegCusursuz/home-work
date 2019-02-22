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

    void TehnicianName() {
        System.out.println("Name: " + this.name);
    }

    public Tehnician(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    void TehnicianNameDirthYear() {
        System.out.println("Name: " + this.name + " Birth Year: " + this.birthYear);
    }

    public Tehnician(int numberBloc, int numberApartoment) {
        this.numberBloc = numberBloc;
        this.numberApartoment = numberApartoment;
    }

    void TehnicianNumberBloocNumberApartiment() {
        System.out.println("Number bloc: " + this.numberBloc + " Number apartoment: " + this.numberApartoment);
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

    void TehnicianNameSurnameId() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " ID: " + this.id + " Streat: " + this.streat + " Birth Year: " + this.birthYear + " Number apartoment: " + this.numberApartoment + " Number bloc: " + this.numberBloc);
    }

    public void Shou() {
        System.out.println("Tehnician:");
        this.TehnicianName();
        this.TehnicianNameDirthYear();
        this.TehnicianNameSurnameId();
        this.TehnicianNumberBloocNumberApartiment();
        System.out.println("");
    }

}
