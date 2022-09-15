public class reverse {
    public static void main(String[] args) {
        String str = "Hasan";
        char[] TempArray = str.toCharArray();
        int left, right=0;
        right = TempArray.length -1;
        char ch;
        for(left = 0; left<right; left++, right--)
        {
            char temp = TempArray[left];
            TempArray[left] = TempArray[right];
            TempArray[right] = temp;
        }

        for(char c : TempArray)
        {
            System.out.print(c);
        }
    
}
}