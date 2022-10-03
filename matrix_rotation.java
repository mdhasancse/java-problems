import java.util.Arrays;

public class matrix_rotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}}; 
        int[][] target = {{1,0},{0,1}};
        System.out.println(same(mat,target));

    }
    static boolean findRotation(int[][] mat, int[][] target) {
        if(same(mat,target))
            return true;
          
          for(int i=0;i<4;i++){
              if(same(mat,target))
                  return true;
              else rotate(mat);
          }
          return false;
      }
      
      static boolean same(int mat[][],int target[][]){
          for(int i=0;i<mat.length;i++){
              for(int j=0;j<mat[0].length;j++){
                  if(mat[i][j]!=target[i][j])
                      return false;
              }
          }
          return true;
      }
      
      static void rotate(int[][] matrix) {
          if(matrix==null || matrix.length==0) 
              return;
          
          for(int i=0;i<matrix.length;i++){
              for(int j=i;j<matrix[0].length;j++){
                  int temp=matrix[i][j];
                  matrix[i][j]=matrix[j][i];
                  matrix[j][i]=temp;
              }
          }
          
          for(int i=0;i<matrix.length;i++){
              swap(matrix[i]);
          }
      }
      
      static void swap(int arr[]){
          int i=0;
          int j=arr.length-1;
          
          while(i<j){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i++;
              j--;
          }
      }
}
