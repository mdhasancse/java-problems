import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of H nd B");
        int h= sc.nextInt();
        int b = sc.nextInt();
        double AreaOfTriangle = (h*b)/2;
        System.out.println("Area of triangle "+h+" and "+b+ " is " + AreaOfTriangle);
    }
}

