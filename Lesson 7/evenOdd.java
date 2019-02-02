import java.util.Scanner;

public class evenOdd{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		
		System.out.println("Enter ten numbers:");
		int number1 = Bender.nextInt() % 2;
		int number2 = Bender.nextInt() % 2;
		int number3 = Bender.nextInt() % 2;
		int number4 = Bender.nextInt() % 2;
		int number5 = Bender.nextInt() % 2;
		int number6 = Bender.nextInt() % 2;
		int number7 = Bender.nextInt() % 2;
		int number8 = Bender.nextInt() % 2;
		int number9 = Bender.nextInt() % 2;
		int number10 = Bender.nextInt() % 2;
		int even = 0;
		int odd = 0;
		
		if (number1 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number2 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number3 == 0){
			even++;
		}
		else{
			odd++;
		}if (number4 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number5 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number6 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number7 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number8 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number9 == 0){
			even++;
		}
		else{
			odd++;
		}
		if (number10 == 0){
			even++;
		}
		else{
			odd++;
		}
			System.out.println("even = " + even);
			System.out.println("odd = " + odd);
	}	
}