package SecondLecture;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any one operator from +, -, *, /");
        String op = sc.nextLine();
        if (op.equals("+"))
        {
            System.out.println("Sum of n1 and n2 is "+ (n1+n2));
        }
        if (op.equals("-"))
        {
            System.out.println("Sub. of n1 and n2 is "+ (n1-n2));
        }
        if (op.equals("*"))
        {
            System.out.println("Mul. of n1 and n2 is "+ (n1*n2));
        }
        if (op.equals("/"))
        {
            System.out.println("Div. of n1 and n2 is "+ (n1/n2));
        }
    }    
}
