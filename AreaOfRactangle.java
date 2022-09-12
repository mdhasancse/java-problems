import java.util.Scanner;
public class AreaOfRactangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of L nd W");
            int l= sc.nextInt();
            int w = sc.nextInt();
            double AreaOfRactangle = (l*w);
            System.out.println("Area of AreaOfRactangle "+l+" and "+w+ " is " + AreaOfRactangle);
        }
}
