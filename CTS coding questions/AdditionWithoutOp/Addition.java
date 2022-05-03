/*Write a program to add two numbers without using the addition operator.*/

package AdditionWithoutOp;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        
        int sum = a-(-b);
        System.out.println("Sum : "+sum);

        reader.close();
    }
}
