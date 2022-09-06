package SecondLecture;

import java.util.Scanner;

public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the princple");
        int p = sc.nextInt();
        System.out.println("Enter the princple rate");
        int rate = sc.nextInt();
        System.out.println("Enter the princple time");
        int time = sc.nextInt();
        int  Simple_Interest = (p*rate*time)/100;
        System.out.println("The simple interest is "+ Simple_Interest);
    }
}
