import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of b and h ");
        int b= sc.nextInt();
        int h= sc.nextInt();
       
        double IsoscelesTriangle = b*h/2;
        System.out.println("Area of IsoscelesTriangle "+b+" and "+h+ " is " + IsoscelesTriangle);
}
}
