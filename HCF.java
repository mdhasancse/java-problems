import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Enter two the number to find their HCF");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        while(n1 != n2)
        {
            if(n1>n2)
            {
                n1 = n1 - n2;
            }
            else{
                n2 = n2-n1;
            }


        
        }
        System.out.println("HCF of two numbers "+n1);
    }
}
