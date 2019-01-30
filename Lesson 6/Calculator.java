import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		double fn;
		double sn;
		String simbol;
		
		
		System.out.println("First number ");
		fn = Bender.nextDouble();
		
		Scanner op = new Scanner(System.in);
		System.out.println("enter operation");
		simbol = op.next();
		
		System.out.println("Second number");
		sn = Bender.nextDouble();
		
		if(simbol.equals("+")){
			System.out.println("Summa =" + (fn + sn));
		}
		if (simbol.equals("-")){
			System.out.println("Summa =" + (fn - sn));
		}
		if (simbol.equals("/")){
			System.out.println("Summa =" + (fn / sn));
		}
		if (simbol.equals("*")){
	    	System.out.println("Summa =" + (fn * sn));		
			}
		if (simbol.equals("%")){
			System.out.println("Summa =" + (fn % sn));
		}
	}
	
}