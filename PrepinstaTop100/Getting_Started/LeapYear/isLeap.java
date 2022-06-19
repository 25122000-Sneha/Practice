/*
scientists set following conditions for a year to be leap year -
1. If a year is divisible by 400
2. If a year is divisible by 4 but not divisible by 100
*/

package Getting_Started.LeapYear;

import java.util.Scanner;

public class isLeap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year = reader.nextInt();
        reader.close();
        
        if(year % 400 == 0){
            System.out.println(year+" is a leap year.");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
