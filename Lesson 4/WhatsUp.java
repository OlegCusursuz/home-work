import java.util.Scanner;
public class WhatsUp {

    public static void main(String[] args){
        System.out.println("\nHello User");
        System.out.println("\nWhat's your name: ");
        System.out.println("\nWhat's your surname: ");
        System.out.println("\nWhat's your Domen: ");
        Scanner reader = new Scanner(System.in);
        String Name = reader.next();
        String Surname = reader.next();
        String Domen = reader.next();
        reader.close();

        System.out.println("Hello!!! " + Name + " " + Surname);
        System.out.println(Domen);

        
    }
}