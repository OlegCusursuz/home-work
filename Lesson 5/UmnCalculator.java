import java.util.Scanner;

public class UmnCalculator{
	public static void main (String[] args){
	Scanner Bender = new Scanner(System.in);
	System.out.println("multiplyCalculator");
	System.out.println("Oleg Cusursuz");
	System.out.println("number1 * number2");
	
    double x, y, result;
	
	System.out.println("number 1: ");
	x = Bender.nextDouble();
	
	System.out.println("number 2: ");
	y = Bender.nextDouble();
	
	result = x * y;
	
	System.out.println("result " + result);

	}
}