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
public class Programmer extends Data {

    public Programmer() {
        System.out.println("Programmer: Defoult constructor called");
    }

    public Programmer(String name) {
        this.name = name;
    }

    void ProgrammerName() {
        System.out.println("Name: " + this.name);
    }

    public Programmer(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    void ProgrammerNameDirthYear() {
        System.out.println("Name: " + this.name + " Birth Year: " + this.birthYear);
    }

    public Programmer(int numberBloc, int numberApartoment) {
        this.numberBloc = numberBloc;
        this.numberApartoment = numberApartoment;
    }

    void ProgrammerNumberBloocNumberApartiment() {
        System.out.println("Number bloc: " + this.numberBloc + " Number apartoment: " + this.numberApartoment);
    }

    public Programmer(String name, String surName, int id, String streat, int birthYear, int numberApartoment, int numberBloc) {
        this.name = name;
        this.surname = surName;
        this.id = id;
        this.streat = streat;
        this.birthYear = birthYear;
        this.numberApartoment = numberApartoment;
        this.numberBloc = numberBloc;
    }

    void ProgrammerNameSurnameId() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " ID: " + this.id + " Streat: " + this.streat + " Birth Year: " + this.birthYear + " Number apartoment: " + this.numberApartoment + " Number bloc: " + this.numberBloc);
    }

    public void Shou() {
        System.out.println("Programmer:");
        this.ProgrammerName();
        this.ProgrammerNameDirthYear();
        this.ProgrammerNameSurnameId();
        this.ProgrammerNumberBloocNumberApartiment();
        System.out.println("");
    }
    
    public void DispleyName(){
        System.out.println("Name: "+this.name);
    }
    public void DispleySurName(){
        System.out.println("Surname: "+this.surname);
    }
    public void DispleyDirthYear(){
        System.out.println("Dirth Year: "+this.birthYear);
    }
    public void DispleyNumberBlooc(){
        System.out.println("Number blooc: "+this.numberBloc);
    }
    public void DispleyNumberApartoment(){
        System.out.println("NUmber apartoment: "+this.numberApartoment);
    } 
    public void DispleyID(){
        System.out.println("ID: "+this.id);
    }
    public void DispleyStreat(){
        System.out.println("Streat: "+this.streat);
    }
    
    public void Atribut(int atribut){
        switch (atribut){
                        case 1:
                            this.DispleyName();
                            break;
                        case 2:
                            this.DispleySurName();
                            break;
                        case 3:
                            this.DispleyID();
                            break;
                        case 4:
                            this.DispleyDirthYear();
                            break;
                        case 5 :
                            this.DispleyStreat();
                            break;
                        case 6 :
                            this.DispleyNumberBlooc();
                            break;
                        case 7 :
                            this.DispleyNumberApartoment();
                            break;
                    }
    }
    
}
