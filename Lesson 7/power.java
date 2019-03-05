import java.util.Scanner;

public class power{
	public static void main(String[] args) {
        Scanner Bender = new Scanner(System.in);
        System.out.println("What's you number ?");
        int summa = 1;
        int power = Bender.nextInt();
        if (power == 0) {
            System.out.println("Summa = 0");
        } else {

            for (int x = 1; x <= power; x++) {
                summa *= power;
            }
            System.out.println("summa =" + summa);

        }
    }
}