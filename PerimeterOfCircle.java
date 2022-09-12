import java.util.Scanner;
public class PerimeterOfCircle {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the Number");
            int red = sc.nextInt();
            double PerimeterOfCircle = 2*3.14*red;
            System.out.println("Perimeter Of Circle "+red+ " is " + PerimeterOfCircle);
        }
    }

