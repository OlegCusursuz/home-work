package SurfacePerimetr;

public class FibonacciGeneration {

    public void generateFiboncciList(int count) {
        int num1 = 0;
        int num2 = 1;
        for (int LOL = 1; LOL <= count; LOL++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

    }

}
