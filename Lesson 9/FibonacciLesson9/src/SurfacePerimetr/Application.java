
package SurfacePerimetr;

import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
       // 1. User input
        Scanner keyboardScanner = new Scanner(System.in);
        Geometri geometry = new Geometri();
        System.out.println("please enter square side:");
        int squareSide = keyboardScanner.nextInt();
        int perimeter;
        int surface;
        surface = geometry.calculateSquareSurface(squareSide);
        perimeter = geometry.calculateSquarePerimeter(squareSide);
        System.out.println("Surface = " + surface);
        System.out.println("Perimeter = "+perimeter);
        
        
        System.out.println("Please enter number to check");
        int number = keyboardScanner.nextInt();
        Algebra algebra = new Algebra();
        algebra.detectOddOrEven(number);
        
        System.out.println("How many Fibonacci numbers to print");
       int count = keyboardScanner.nextInt();
       FibonacciGeneration fibonacciGeneration = new FibonacciGeneration();
       fibonacciGeneration.generateFiboncciList(count);
        
       
        
        } 
                
    }
    

