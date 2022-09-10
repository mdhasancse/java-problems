import java.util.Scanner;

public class RupIntoDoller {
    public static void main(String[] args) {
        System.out.println("Enter the currency in rupees");
        Scanner sc = new Scanner(System.in);
        double rupees = sc.nextDouble();
        double doller = rupees/79.81;
        System.out.println(rupees+ " rupees in doller is " +doller );
    }
}
