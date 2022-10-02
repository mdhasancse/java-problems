public class Maximum_Population_Year {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i=0;i<logs.length;i++){
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        
        //Prifix Sum
        for(int i=1;i<101;i++)
        {
            arr[i] += arr[i-1];
        }
        int maxVal = 0;
        int maxYear = 1950;
        for(int i=0; i<101; i++)
        {
            if(maxVal < arr[i])
            {
            maxVal = arr[i];
            maxYear = i + 1950;
        }
        }
        return maxYear;
    }
}
