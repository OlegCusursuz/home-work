import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		double fn;
		double sn;
		String simbol;
		boolean exit = true;
		int feadback;

		for( ;exit; ){
		
		 
		System.out.println("First number ");
		fn = Bender.nextDouble();
		
		Scanner op = new Scanner(System.in);
		System.out.println("enter operation");
		simbol = op.next();
		
		System.out.println("Second number");
		sn = Bender.nextDouble();

		switch(simbol){
			case "+" :
			System.out.println("summa = " + (fn + sn));
			break;
			case "-" :
			System.out.println("summa = " + (fn - sn));
			break;
			case "*" :
			System.out.println("summa = " + (fn * sn));
			break;
			case "/" :
			System.out.println("summa = " + (fn / sn));
			break;
			case "%" :
			System.out.println("summa = " + (fn % sn));
			break;
			default :
			System.out.println("Fatal!!!!!!!!!");
		}
		System.out.println("1: Again");
		System.out.println("2: Exit");
		feadback = Bender.nextInt();
		switch(feadback){
			case 1:{
				exit = true;
			}break;
			case 2:{
				exit = false;
			}break;
			default:
				System.out.println("       !!!eror!!! \nnumber not entered correctly ");
				exit = false;
			
			
		}
		}
		
	}
	
}