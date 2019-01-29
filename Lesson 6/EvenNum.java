import java.util.Scanner;

public class EvenNum{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		int a;
		
		System.out.println("what's your number");
		a = Bender.nextInt();
		int b = a % 2;
		
		if(b == 0)
			System.out.println("even number");
		else
			System.out.println("odd number");
		
		
		
	}
}