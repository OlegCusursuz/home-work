import java.util.Scanner;

public class amountTo{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		
		System.out.println("what's your number");
		int numberScanner = Bender.nextInt();
		int summa = 0;

		
		for (int number = 0;  number <= numberScanner; number++){
			summa += number;
		}
		System.out.println(summa);
	}
}