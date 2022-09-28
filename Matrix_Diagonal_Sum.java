import java.util.Arrays;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args)
     {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}
                      };
    System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {

    int sum=0;

    for(int i=0;i<mat.length;i++)
    {
        for(int j=0;j<mat[0].length;j++)
        {
            if(i==j||i==mat[0].length-j-1)
            {
                sum+=mat[i][j];
            }
        }
    }
    return sum;
}
}


