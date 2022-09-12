package SecondLecture;

public class ArmstrongNum {
    public static void main(String[] args) {
        
        int n = 153; // cube of 1 nd 5 nd 3 -----> Then add 1+125+27=153
                    // if the input will 2 digit then Square it as soon...
        int temp = n;
        int rem, sum = 0;

        while(n>0){
        rem = n%10;
        sum = sum + rem*rem*rem;
        n = n/10;
        }
        if (temp == sum)
        System.out.println("its an Armstrong Num");
        else
        System.out.println("its not an Armstrong Num");

}
}
