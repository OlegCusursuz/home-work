import java.util.Scanner;

public class evenOdd{
	public static void main(String[] args) {
        int even =0;
        int odd = 0;
        Scanner bender = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Enter ten numbers:");
        for(int in:num){
            in = bender.nextInt()%2;
            if(in == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even = "+even);
        System.out.println("Odd = "+odd);
        
    }
}