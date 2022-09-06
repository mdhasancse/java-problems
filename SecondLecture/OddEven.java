package SecondLecture;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if (val % 2 == 0)
        {
            System.out.println(val+" is even number");
        }
        else{
            System.out.println(val+" is odd number");
        }

    }
}
