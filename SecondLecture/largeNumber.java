package SecondLecture;

import java.util.Scanner;

public class largeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n1 = sc.nextInt();
        System.out.println("enter second number");
        int n2 = sc.nextInt();
        if (n1 > n2)
        {
            System.out.println(n1+" first number is greater");
        }
        else{
            System.out.println(n2+"  second number is greater");
        }
    }
}
