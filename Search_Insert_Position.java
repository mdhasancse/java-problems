public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println((searchElement(nums,target)));
    }

    static int searchElement(int[] nums,int target)
    {
        int start=0;
        int end = nums.length-1;
        int mid=0;

        //[1,3,5,6]--. 0+(3-0)/2=1---> 3+(4-3)/2=3
        while(end >= start)
        {
            mid = start+(end-start)/2;

            if(nums[mid] < target)
            {
                start=mid+1;
            }
            if(nums[mid] > target)
            {
                end=mid-1;
            }

            if(nums[mid] == target)
            {
                return mid;
            }


        }
        return end+1;
    }
    
}
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Input: nums = [1,3,5,6], target = 2
// Output: 1

