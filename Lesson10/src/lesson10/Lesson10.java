/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson10;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
    // 1. User input
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Please enter square side lenght:");
        int squareSide = keyboardScanner.nextInt();
        // 2. Calculate perimeter
        int perimeter = 4 * squareSide;
        // 3. Calculate surface
        int surface = squareSide * squareSide;
        // 4. Display the result
        System.out.println("Surface " + surface + "; Perimeter:" + perimeter);
        
        
        System.out.println("Please enter square rectangle size;");
        System.out.println("Lenght:");
        // 5. Calculating Rectangle
        int lenght = keyboardScanner.nextInt();
        System.out.println("Width");
        int width = keyboardScanner.nextInt();
        int rectPerimeter = (lenght + width) * 2;
        int rectSurface = lenght * width;
        System.out.println("Rectangle: Surface " + rectSurface + "; Perimeter:" + rectPerimeter);
        
        
        
        // another method
        // System.out.println("Enter your number");
        // int oddOrEven = keyboardScanner.nextInt();
        // String result = oddOrEven % 2 == 0 ? "even" : "false";
        // System.out.println("Result: " + oddOrEven + " is " + result);
        // Calculating is the number odd or even
        int oddOrEven = keyboardScanner.nextInt();
        if(oddOrEven % 2 == 0) {
                //even
                System.out.println("Result : is even");
        } // we can use else instead of if 
        if(oddOrEven % 2 !=0) {
                //odd
                System.out.println("Result : is odd");
        }
        System.out.println("Result: " + oddOrEven + " is " + (oddOrEven % 2 == 0 ? "even" : "odd"));
                
        
        
         // 1.user input 
        System.out.println("How many do you want to see fibonacci numbers ");
        
        int fibonacciTo= keyboardScanner.nextInt() ;
        int num1 = 0; 
        int num2 = 1;
        for (int LOL = 1; LOL <= fibonacciTo; LOL++){
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        } 
    }
    
}

