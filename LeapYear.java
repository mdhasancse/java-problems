import java.util.Scanner;

import javax.print.attribute.SupportedValuesAttribute;

//Input a year and find whether it is a leap year or not.


public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year ");
        Scanner input = new Scanner(System.in); 
        year = input.nextInt();
        // if(((year%4==0) && (year%100==0)) || (year%400==0))
        //     System.out.println("Leap year");
        // else
        // System.out.println("not a leap year"); 

        //orr
        if(year%4==0)
        {
            if (year%100==0)
            {
                if(year%400==0)
                {
                System.out.println("Leap year");
                }else
                 {
                System.out.println("NOT leap year");
                }
                
            }
            else{
                System.out.println("Its a leap year");
            }
        }
        else
        System.out.println("not leap yearrr");
          
    }    
   
}

