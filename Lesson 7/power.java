import java.util.Scanner;

public class power{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		System.out.println("What's you number ?");
		int summa = 1;
		int power = Bender.nextInt();
		int x = 1;
		for( ; x <= power; x++){
			summa = summa * power;
		} 
		System.out.println("summa =" + summa);
		
	}
}