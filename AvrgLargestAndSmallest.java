import java.util.Scanner;

public class AvrgLargestAndSmallest {
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
        float smallestNumber = arr[0]; 
		float largestNumber = arr[0]; 
        float lCount=0;
        float sCount=0;
		 
        // To find Small and large element from array
		for(int i=0; i < arr.length; i++) 
		{ 
			if(arr[i] > largestNumber){ 
				largestNumber = arr[i]; 
			} 
			else if(arr[i] < smallestNumber) 
			{ 
				smallestNumber = arr[i]; 
			}

		}
        
        // Count Smallest number and Largest number from the array 
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==largestNumber)
            {
                lCount++;
            }
            if(arr[i]==smallestNumber){
                sCount++;
            }

        }
        // find average
        float avg=(smallestNumber*sCount+largestNumber*lCount)/(lCount+sCount);
        System.out.println(avg);
}  
}


