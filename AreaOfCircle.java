import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number");
        int red = sc.nextInt();
        double AreaOfCircle = Math.pow(red, 2)*3.14;
        System.out.println("Area of circle "+red+ " is " + AreaOfCircle);
    }
}
