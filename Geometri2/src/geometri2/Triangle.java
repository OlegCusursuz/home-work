
package geometri2;


public class Triangle {
    
    public int calculatePerimetrTriangle(int sideA, int sideB, int sideC){
        int perimetrTrisngle = sideA+sideB+sideC;
        System.out.println("Perimert = "+perimetrTrisngle);
        return 0;
    }
    public int calculateSurfaceTriangle(int sideA, int sideH){
    int surfaceTriangle = (sideA*sideH)/2;
        System.out.println("Surface = "+surfaceTriangle);
    return 0;
    }
    
}
