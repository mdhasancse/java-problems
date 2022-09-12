import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of p nd q");
        int p= sc.nextInt();
        int q = sc.nextInt();
        double AreaOfRhombus = (p*q)/2;
        System.out.println("Area of AreaOfRhombus "+p+" and "+q+ " is " + AreaOfRhombus);
    }
}
