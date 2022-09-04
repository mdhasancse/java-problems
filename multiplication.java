//Take a number as input and print the multiplication table for it.
import java.util.Scanner;


public class multiplication {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for (int i=1;i<=10;i++)
        
        {
            System.out.println(num + " * "+i+ " = "+num*i);
        }
    

        

    }
}
