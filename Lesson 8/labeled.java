import java.util.Scanner;

public class labeled{
	public static void main(String[] args){
		Scanner Bender = new Scanner(System.in);
		outer:
		for (int iteration = 0; iteration < 1; iteration++){
			for (int innerIteration = 0; innerIteration < 10; innerIteration++){
				if(innerIteration % 2 > 0){
					continue outer;
				}
				System.out.println(innerIteration);
			}
		}
		
	}
}