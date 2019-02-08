
package FibonacciLesson9;

import java.util.Scanner;

public class FibonacciLesson9 {
    
    public static void main(String[] args) {
        // 1.user input 
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("How many do you want to see fibonacci numbers ");
        
        int fibonacciTo= keyboardScanner.nextInt() ;
        int num1 = 0; 
        int num2 = 1;
        for (int LOL = 1; LOL <= fibonacciTo; ++LOL){
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        } 
                
    }
    
}
