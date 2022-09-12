import java.lang.Math;
import java.util.Scanner;
public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= sc.nextInt();
       
        double EquilateralTriangle =  (Math.sqrt(3)*(a*a)/4);
        System.out.println("Area of EquilateralTriangle "+a+" is " + EquilateralTriangle);
    
    }
}
