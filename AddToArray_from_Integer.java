import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArray_from_Integer {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        
        System.out.println((addToArrayForm(arr)));
       
    }
    static List<Integer> addToArrayForm(int[] arr)
    {
        List<Integer> result = new ArrayList<>();
        int k = 34;
        int ArrayValue=0;
        for (int i = 0; i < arr.length; i++)
        {
            ArrayValue = 10 * ArrayValue + arr[i];
        }
        int temp = ArrayValue + k;
        System.out.println(ArrayValue);
        
        while (temp > 0) {
            result.add(0, temp % 10);
            temp = temp / 10;
        }
        return result;
    }
}
