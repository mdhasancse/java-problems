public class Power {
    public static void main(String[] args) {
        System.out.println("2 to the power 3 : = " + findPower(2, 3)); 
        System.out.println("3 to the power 3 : = " + findPower(3, 4)); 
        System.out.println("2 to the power 5 : = " + findPower(2, 5)); 
        System.out.println("5 to the power 2 : = " + findPower(3, 2)); 
        System.out.println("9 to the power 2 : = " + findPower(9, 3));

        
    }
    
    static long findPower(int x, int y)
    {
        long res = x;
        for(int i=1; i< y; i++)
        {
            res = res*x;
        }
        return res;
    }
}
