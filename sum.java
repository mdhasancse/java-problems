import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int summ = sum(5, 8);
        // System.out.println("Enter first number");
        // int num1 = in.nextLine()
        // System.out.println("Enter first number");
        // int num2 = in.nextLine()
        System.out.println(summ);


        
    }
    static int sum(int num1, int num2)
    {
        int sum;
        sum = num1+num2;
        return sum;
    }
    
}
