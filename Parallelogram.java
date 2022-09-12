import java.util.Scanner;
public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of b and h ");
        int b= sc.nextInt();
        int h= sc.nextInt();
       
        double Parallelogram = b*h;
        System.out.println("Area of Parallelogram "+b+" and "+h+ " is " + Parallelogram);
}
}
