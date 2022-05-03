/*Write a program to subtract two numbers without using a subtraction operator.*/

package SubOfNum;

import java.util.Scanner;

public class Difference {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int diff = a + ~b + 1;
        
        System.out.println("Diff= "+diff);
        
        reader.close();
    }
}
