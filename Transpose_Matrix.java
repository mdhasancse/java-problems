import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(transpose(matrix)));
       
    }  
    
    static int[][] transpose(int[][] matrix) {
        int n = matrix[0].length;
        int m=matrix.length;
        int[][] arr = new int[n][m];// becouse of making Transpose [m][n] --> [n][m]
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                // drow one digonal from element 2 --> 6 After that interchange upper nd below items
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
}
}
