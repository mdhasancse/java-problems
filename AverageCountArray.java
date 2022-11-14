import java.util.Scanner;

public class AverageCountArray {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array ");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array ");
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr[i]=sc.nextInt();  
        }  
        int count = 0;
        int sum = 0;
        int result = 0;

        // Storing tge array of items into sum 
        for(int i=0; i<arr.length;i++)
        {
            sum = sum+arr[i];
            
        } 
        //Calculate Avarage
        int average = (sum / n);
        
        // Search the avarage item in array of items
        for (int i=0;i<arr.length;i++)
        {
            if(average == arr[i])
            {
                result = result+1;

            }
        }
        System.out.println(result);
    }
}
