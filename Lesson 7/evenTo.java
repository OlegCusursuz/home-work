import java.util.Scanner;

public class evenTo{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		
		System.out.println("what's your number");
		int numberScanner = Bender.nextInt();
		int summa = 0;
		
		
		for (int number = 0; number <= numberScanner; number++){
			int modul = number % 2;
			if(modul == 0){
				summa += number;
				
			}
			
		}
		System.out.println("summa =" + summa);
		
	}
}