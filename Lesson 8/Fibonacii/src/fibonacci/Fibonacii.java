/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
public class Fibonacii {
    public static void main(String[] args) {
        Scanner Bender = new Scanner(System.in);
        System.out.println("What's you number: ");
        int n0 = 0;
        int n1 = 1;
	int n2;
        int fibonacciTo = Bender.nextInt();
	System.out.print(n0+" "+n1+" ");
	for(int i = 3; i <= fibonacciTo; i++){
	    n2=n0+n1;
	    System.out.print(n2+" ");
	    n0=n1;
	    n1=n2;
	}
	
       
    }
    
}
