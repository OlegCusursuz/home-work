package lesson15;

import java.util.Scanner;

public class Lesson15 {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Danil", "Petrosian", 1, "Gogolia", 1998, 43, 345);
        Bookkeeper bookkeeper = new Bookkeeper("Vania", "Sarioglo", 2, "Puhkina", 1996, 133, 42);
        Manager manager = new Manager("Kolia", "Konstantinov", 3, "Gogolia", 1991, 345, 109);
        Salesmen salesmen = new Salesmen("Sonea", "Polo", 5, "Gogolea", 1985, 143, 345);
        Tehnician tehnician = new Tehnician("Vitek", "Kristev", 4, "Cikalovo", 1994, 56, 654);
        Scanner bender = new Scanner(System.in);
        boolean def = true;
        while (def) {
            System.out.println("Hello!!\n1:Programmer\n2:Bookkeeper\n3:Manager\n4:Salesman\n5:Tehnician\n6:Everything ");
            int rob = bender.nextInt();
            switch (rob) {
                case 1:
                    programmer.Shou();
                    System.out.println("1:Name:\n2:Surname\n3:ID\n4:Birth Year\n5:Streat\n6:Number blooc\n7:Number Apartoment");
                    int atribut=bender.nextInt();
                    programmer.Atribut(atribut);
                    def = false;
                    break;
                case 2:
                    bookkeeper.Shou();
                    System.out.println("1:Name:\n2:Surname\n3:ID\n4:Birth Year\n5:Streat\n6:Number blooc\n7:Number Apartoment");
                    int atribut1=bender.nextInt();
                    bookkeeper.Atribut(atribut1);
                    def = false;
                    break;
                case 3:
                    manager.Shou();
                    System.out.println("1:Name:\n2:Surname\n3:ID\n4:Birth Year\n5:Streat\n6:Number blooc\n7:Number Apartoment");
                    int atribut2=bender.nextInt();
                    bookkeeper.Atribut(atribut2);
                    def = false;
                    break;
                case 4:
                    salesmen.Shou();
                    System.out.println("1:Name:\n2:Surname\n3:ID\n4:Birth Year\n5:Streat\n6:Number blooc\n7:Number Apartoment");
                    int atribut3=bender.nextInt();
                    bookkeeper.Atribut(atribut3);
                    def = false;
                    break;
                case 5:
                    tehnician.Shou();
                    System.out.println("1:Name:\n2:Surname\n3:ID\n4:Birth Year\n5:Streat\n6:Number blooc\n7:Number Apartoment");
                    int atribut4=bender.nextInt();
                    bookkeeper.Atribut(atribut4);
                    def = false;
                    break;
                case 6:
                    System.out.println("Everything");
                    programmer.Shou();
                    bookkeeper.Shou();
                    manager.Shou();
                    salesmen.Shou();
                    tehnician.Shou();
                default:
                    def = true;
                    System.out.println("1:Again 2:Exit");
                    int exit = bender.nextInt();
                    if (2 == exit) {
                        def = false;
                    }

            }
        }

    }
}