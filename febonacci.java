import java.util.Scanner;

public class febonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get their febonacci val");
        int n = sc.nextInt();
        int res = fab(n);
        System.out.println(" febonacci of "+n+ " is " +res);
    }
        static int fab(int n)
        {
            int a=0, b=1,c;
            
            if(n==0)
            {
                return a;
            }
            for(int i=2;i<=n;i++)
            {
                c = a+b;
                a =b;
                b =c;
                
            }
            return b;
        }
    
    
}

