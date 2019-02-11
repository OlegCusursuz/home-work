
package geometri2;

import java.util.Scanner;


public class Geometri2 {

    public static void main(String[] args) {
        Scanner Bender = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Hello, this application was made by Oleg Kusursuz,\n the application considers and shows the surface and perimeter:\n a rectangle, a diamond and a triangle");
        System.out.println("Enter the size of the sides of the rectangle:");
        System.out.println(" Side length A");
        int squareSideA=Bender.nextInt();
        System.out.println("Side length B");
        int squareSideB=Bender.nextInt();
        int surface;
        int perimetr;
        surface=rectangle.calculateSquareSurface(squareSideA, squareSideB);
        perimetr=rectangle.calculateSquarePerimeter(squareSideA, squareSideB);

        
        Diamond diamond = new Diamond();
        System.out.println("Enter the length and height of the diamond:");
        System.out.println("diamond base length");
        int length=Bender.nextInt();
        System.out.println("height length");
        int height=Bender.nextInt();
        int surfaceDiamond;
        int perimetrDiamond;
        perimetrDiamond = diamond.calcultePerimeter(length);
        surfaceDiamond=diamond.calculteSurface(length, height);
        
        Triangle triangle = new Triangle();
        System.out.println("Enter the sides of the triangle and the height lowered to the side A");
        System.out.println("Side length A");
        int sideA=Bender.nextInt();
        System.out.println("Side length B");
        int sideB=Bender.nextInt();
        System.out.println("Side length C");
        int sideC=Bender.nextInt();
        System.out.println("Length of height, lowered to side A");
        int sideH=Bender.nextInt();
        int surfaceTriangle;
        int perimetrTriangle;
        surfaceTriangle=triangle.calculateSurfaceTriangle(sideA, sideH);
        perimetrTriangle=triangle.calculatePerimetrTriangle(sideA, sideB, sideC);
        
        
    }
    
}
