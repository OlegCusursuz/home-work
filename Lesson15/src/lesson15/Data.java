package lesson15;

import java.util.Scanner;

public class Data {

    Scanner bender = new Scanner(System.in);
    public String name;
    String surname;
    int birthYear;
    int id;
    String streat;
    int numberBloc;
    int numberApartoment;

    void Name() {
        System.out.println("Name: " + this.name);
    }

    void NameDirthYear() {
        System.out.println("Name: " + this.name + " Birth Year: " + this.birthYear);
    }

    void NumberBloocNumberApartiment() {
        System.out.println("Number bloc: " + this.numberBloc + " Number apartoment: " + this.numberApartoment);
    }

    void NameSurnameId() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " ID: " + this.id + " Streat: " + this.streat + " Birth Year: " + this.birthYear + " Number apartoment: " + this.numberApartoment + " Number bloc: " + this.numberBloc);
    }

    public void Shou() {
        this.Name();
        this.NameDirthYear();
        this.NameSurnameId();
        this.NumberBloocNumberApartiment();
    }

    public void DispleyName() {
        System.out.println("Name: " + this.name);
    }

    public void DispleySurName() {
        System.out.println("Surname: " + this.surname);
    }

    public void DispleyDirthYear() {
        System.out.println("Dirth Year: " + this.birthYear);
    }

    public void DispleyNumberBlooc() {
        System.out.println("Number blooc: " + this.numberBloc);
    }

    public void DispleyNumberApartoment() {
        System.out.println("NUmber apartoment: " + this.numberApartoment);
    }

    public void DispleyID() {
        System.out.println("ID: " + this.id);
    }

    public void DispleyStreat() {
        System.out.println("Streat: " + this.streat);
    }

    public void Atribut() {
        System.out.println("1:Name:\n2:Surname\n3:ID\n4:Birth Year\n5:Streat\n6:Number blooc\n7:Number Apartoment");
        int atribut = bender.nextInt();
        switch (atribut) {
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
            case 5:
                this.DispleyStreat();
                break;
            case 6:
                this.DispleyNumberBlooc();
                break;
            case 7:
                this.DispleyNumberApartoment();
                break;
        }
    }

}
