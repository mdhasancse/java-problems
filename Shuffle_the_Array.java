import java.util.*;
public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = 0;
        for(int i=0; i<nums.length; i=i+2)
        {
            arr[i] = nums[j];
            arr[i+1] = nums[n+j];
            j++;
        }
        return arr;
    }
}
