public class IntPelindrome {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int sum = 0;
        
        while(n>0)
        {
            int rev = n%10;
            sum = (sum*10) + rev;
            n = n/10;
        }
            if (temp == sum)
            {
                System.out.println(temp+ " is a palindrome ");
            }
            else{
                System.out.println(temp+ " is not a palindrome ");
            }
        
    }
}
