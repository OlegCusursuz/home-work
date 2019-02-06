import java.util.Scanner;

public class new1 {
	public static void main (String[] args){
		// 1.user input 
		Scanner keyboardScanner = new Scanner(System.in);
		int squareSide = keyboardScanner.nextInt();
		// 2.calculate perimeter
		int perimeter = 4 * squareSide;
		
		// 3.calculate surface
        int surface = squareSide * squareSide;
		 
		//4. display yhe result
		System.out.println("Surface " + surface + "; perimeter:" + perimeter);
		System.out.println("please enter square rectangle size :");
		System.out.println("Lenght");
		int rectSideA = keyboardScanner.nextInt();
		System.out.println("Width");
		int rectSideB = keyboardScanner.nextInt();
		int rectPermeter = (rectSideA + rectSideB)*2;
		int rectSurface = rectSideA * rectSideB;
		System.out.println("Rectangle: Surface " + rectSurface + "; perimeter:" + rectPermeter);
		
		int oddOrEven = keyboardScanner.nextInt();

		System.out.println("result: " + oddOrEven + "is " + (oddOrEven % 2 == 0 ? "even" : "odd"));
		
		
		
	}
	
}