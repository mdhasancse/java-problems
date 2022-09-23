
import java.util.*;
public class Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println((numIdenticalPairs(nums)));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        
      int i,j;
        for(i=0;i<nums.length;i++)
        {
        for(j=i+1;j<nums.length;j++)
            { 
                if(nums[i]==nums[j])
                {
                    count=count+1;
                }
            
            }
        }
            
        return count;
        }
}
