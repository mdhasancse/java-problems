public class Cells_Odd_Values {
    public static void main(String[] args) {
        int m = 2;
        int n =3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    
    static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m]; 
        int[] col = new int[n]; 

        for(int i = 0; i < indices.length; i++){
            row[indices[i][0]] += 1;  
            col[indices[i][1]] += 1; 
        }

        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if((row[i] + col[j]) % 2 != 0){ 
                    count += 1; 
                }
            }
        }
        return count;
    }
}
