import java.lang.*;
public class IsPrime {
    public static void main(String[] args) {
        boolean num = isprime(7);
        if(num) // is true
        {
        System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
        
    }
        static boolean isprime(int n)
        {
            if(n <= 1)
            return false;

            if(n == 2)
            return true;

            for (int i=3;i< n/2; i++)
            {
                if(n%2 == 0)
                return false;
            }
            return true;
        }
    }

