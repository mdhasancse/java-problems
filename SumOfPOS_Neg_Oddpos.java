import java.util.Scanner;

public class SumOfPOS_Neg_Oddpos {
    public static void main(String[] args) {
        
        int evenSum;
        int oddSum;
        int negSum = evenSum = oddSum = 0; 
        Scanner in = new Scanner(System.in);
        int val = 0; 
        System.out.println("Enter numbers; terminate list with 0");
        while((val = in.nextInt()) !=0)
        {
            if (val < 0) { 
                negSum += val; 
            } else if (val%2 == 0) { 
                evenSum += val; 
            } else { 
                oddSum += val; 
            }
        }
        System.out.println("EvenNumbers Sum:"+evenSum); 
		System.out.println("OddNumbers Sum:"+oddSum); 
		System.out.println("NegativeNumbers Sum:"+negSum); 
    }
}
