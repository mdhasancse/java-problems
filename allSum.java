import java.util.Scanner;

public class allSum {
    public static void main(String[] args) {
        
    
    while(true)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value or x");
        int n = sc.nextInt();
        String n1 = sc.next();
        int sum =0;
        sum = sum+n;
        if (n1=="x")
        {
            System.out.println(sum);
            break;
        }
    }
}
}
