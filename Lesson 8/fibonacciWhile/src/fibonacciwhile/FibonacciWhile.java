/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciwhile;

import java.util.Scanner;

/**
 *
 * @author kusur
 */
public class FibonacciWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Bender = new Scanner(System.in);
        System.out.println("What's you number: ");
        int n0 = 1;
        int n1 = 1;
	int n2;
        int i = 3;
        int fibonacciTo = Bender.nextInt();
	System.out.print(n0+" "+n1+" ");
	while( i <= fibonacciTo){
	    n2=n0+n1;
	    System.out.print(n2+" ");
	    n0=n1;
	    n1=n2;
            i++;
	}
	System.out.println();
    }
    
}
