import java.util.ArrayList;

public class Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n-1;i++)
        {
            if(max > arr[i+1])
            {
                max = max;
            }else{
                max = arr[i+1];
            }   
        }
        System.out.println(max);
        System.out.println(" ");

        ArrayList<Boolean> list = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]+3 >= max)
            {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        System.out.println(list);


       
    }
}
