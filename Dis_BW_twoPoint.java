import java.util.Scanner;
public class Dis_BW_twoPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the X1 cordinator");
        int x1 = sc.nextInt();
        System.out.println("Please enter the X2 cordinator");
        int x2 = sc.nextInt();
        System.out.println("Please enter the y1 cordinator");
        int y1 = sc.nextInt();
        System.out.println("Please enter the y2 cordinator");
        int y2 = sc.nextInt();
        int temp = (x2-x1);
        int temp1 = (y2-y1);
        double tempRes = (Math.pow(temp, 2)*Math.pow(temp1, 2));
        double res = Math.sqrt(tempRes);
        System.out.println("Distance Between Two Points is "+res);
    }
}
