import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the product price");
        int p = sc.nextInt();
        System.out.println("Please enter the product discount price");
        int d = sc.nextInt();
        int temp = (p*d)/100;
        int res = p-temp;
        System.out.println(" After discount the product price will be "+res);

    }
}
