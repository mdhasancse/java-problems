public class Highest_Altitude {
    public static void main(String[] args) {
    int[] gain = {-5,1,5,0,-7};
    System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int highest = 0;
        int current = 0;
        for(int i=0;i<gain.length;i++)
        {
            current = current+gain[i];
            if(current > highest)
            {
                highest = current;
            }
        }
        return highest;
        
    }
}
