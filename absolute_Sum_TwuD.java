public class absolute_Sum_TwuD {
    public static void main(String[] args) {
        int [][] arr = {
            {7,1,3},
            {1,2,3},
            {4,0,6}
        };
        System.out.println(diagonalDifference(arr));
    }

        static int diagonalDifference(int[][] arr)
        {
        int From_left_sum = 0;
        int From_right_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i == j)
                {
                    From_left_sum+= arr[i][j];
                }
                if( (i+j) == arr.length-1) // total size is 3 in cirst test case
                {
                    From_right_sum+=arr[i][j];
                }
            }
        }
    return Math.abs(From_left_sum - From_right_sum);
    }
}
