import java.util.ArrayList;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        
        int hcf = GCDorHCF(n1,n2);
        System.out.println("HCF or GCD is "+hcf);

        int findLCM = n1*n2/hcf;
        System.out.println("LCM is " +findLCM);
        
    }

    static int GCDorHCF(int n1, int n2)
    {
        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1 = n1 - n2;
            }
            else{
                n2 = n2-n1;
            }
        }
        return n1;
        
    }

    
}
