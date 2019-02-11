/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurfacePerimetr;


public class Algebra {

    public void detectOddOrEven(int number) {
        System.out.println("Result: " + number + " is " + (number % 2 == 0 ? "even" : "odd"));
    }

}
// 1. User input
//       
//        System.out.println("Please enter square side lenght:");
//        int squareSide = keyboardScanner.nextInt();
//        // 2. Calculate perimeter
//        int perimeter = 4 * squareSide;
//        // 3. Calculate surface
//        int surface = squareSide * squareSide;
//        // 4. Display the result
//        System.out.println("Surface " + surface + "; Perimeter:" + perimeter);
//        
//        
//        System.out.println("Please enter square rectangle size;");
//        System.out.println("Lenght:");
//        // 5. Calculating Rectangle
//        int lenght = keyboardScanner.nextInt();
//        System.out.println("Width");
//        int width = keyboardScanner.nextInt();
//        int rectPerimeter = (lenght + width) * 2;
//        int rectSurface = lenght * width;
//        System.out.println("Rectangle: Surface " + rectSurface + "; Perimeter:" + rectPerimeter);
//        
