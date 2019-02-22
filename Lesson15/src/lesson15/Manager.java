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
public class Manager extends Data {

    public Manager() {

    }

    public Manager(String name) {
        this.name = name;
    }

    void ManagerName() {
        System.out.println("Name: " + this.name);
    }

    public Manager(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    void ManagerNameDirthYear() {
        System.out.println("Name: " + this.name + " Birth Year: " + this.birthYear);
    }

    public Manager(int numberBloc, int numberApartoment) {
        this.numberBloc = numberBloc;
        this.numberApartoment = numberApartoment;
    }

    void ManagerNumberBloocNumberApartiment() {
        System.out.println("Number bloc: " + this.numberBloc + " Number apartoment: " + this.numberApartoment);
    }

    public Manager(String name, String surName, int id, String streat, int birthYear, int numberApartoment, int numberBloc) {
        this.name = name;
        this.surname = surName;
        this.id = id;
        this.streat = streat;
        this.birthYear = birthYear;
        this.numberApartoment = numberApartoment;
        this.numberBloc = numberBloc;
    }

    void ManagerNameSurnameId() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " ID: " + this.id + " Streat: " + this.streat + " Birth Year: " + this.birthYear + " Number apartoment: " + this.numberApartoment + " Number bloc: " + this.numberBloc);
    }

    public void Shou() {
        System.out.println("Manager:");
        this.ManagerName();
        this.ManagerNameDirthYear();
        this.ManagerNameSurnameId();
        this.ManagerNumberBloocNumberApartiment();
        System.out.println("");
    }

}
