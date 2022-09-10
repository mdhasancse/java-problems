import java.util.ArrayList;
import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        String str = "rever";
        String reverStr = "";
        int strLength = str.length();
        for(int i=(strLength - 1);i>=0;--i)
        {
            reverStr = reverStr + str.charAt(i);
        }

        if(str.toLowerCase().equals(reverStr.toLowerCase()))
        {
            System.out.println(str+ " is a palindrome string");
        }else{
            System.out.println(str+ " is not a palindrome string");
        }
            
    }
}
