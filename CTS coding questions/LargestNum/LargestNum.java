
/* Write a program to show the largest among three numbers using conditional operator.*/ 
package LargestNum;
import java.util.*;
public class LargestNum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        int largest = (num1 > num2)? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("Largest is "+largest);
        reader.close();
    }
}