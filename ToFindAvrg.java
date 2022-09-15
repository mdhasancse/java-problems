import java.util.Scanner;

public class ToFindAvrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find their avarage");
        int n = sc.nextInt();
        int res = avarage(n);
        System.out.println(" Avarage is "+res);
    }

    static int avarage(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        int avg = sum/n;
        return avg;
        
    }
    
}
