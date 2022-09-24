import java.util.ArrayList;
import java.util.Arrays;

public class Numbers_Are_Smaller_thn_cur_No {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int n = nums.length;
        System.out.print(Arrays.toString(smallerNumbersThanCurrent(nums,n)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums, int n) {
        // ArrayList<Integer> array = new ArrayList<>();
        
        int[] array = new int[nums.length];
        
        // int n = nums.length;
        for(int j=0;j<n;j++)
        {
            int count = 0;
            for(int i=0;i<n;i++)
            {
                if (nums[j] > nums[i])
                {
                    count = count+1;
                }
            } 
            array[j] = count;  
        }
        
        return array;
        
    }
}
