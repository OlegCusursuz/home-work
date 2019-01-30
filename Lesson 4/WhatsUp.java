import java.util.Scanner;
public class WhatsUp {

    public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		String name, surname, Domen;
		
        System.out.println("\nHello User");
        System.out.println("\nWhat's your name: ");
		name = Bender.next();
        System.out.println("\nWhat's your surname: ");
		surname = Bender.next();
        System.out.println("\nWhat's your Domen: ");
        Domen = Bender.next();

        System.out.println("Hello!!! " + name + " " + surname);
        System.out.println(Domen);

        
    }
}