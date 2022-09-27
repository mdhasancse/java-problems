import java.util.Arrays;

public class Flipping_Image {
    private static final int N = 0;
    public static void main(String[] args) {
        int M = 3; // Initialize size of row
        int N = 3; // ---  ---- --- ---  Col
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));

    }
    static int[][] flipAndInvertImage(int[][] image) {
        int M=image.length;
        int N=image.length;   // Initialize size of row. and col
        for(int i=0;i<M;i++)
        {
              for(int j=0;j<N/2;j++){
                int temp = image[i][j];
                image[i][j] = image[i][N-1-j];
                image[i][N-1-j] = temp;
            }
        
       for(int j=0;j<N;j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        
        return image;
    }
}
