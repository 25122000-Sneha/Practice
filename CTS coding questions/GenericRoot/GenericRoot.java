/*
Generic Root: of a number is sum of all the digits of the number until we get a single-digit output.
For Example: If user input number is 12345, then we add all the individual digits of the number 
i.e., 1 + 2 + 3 + 4 + 5 = 15. We got 15. Now we add individual digits of number 15 
i.e., 1 + 5 = 6. So Generic Root of number 12345 is 6.

Approach:

Declare a number.
Then take a while loop and continue it till the number is a one digit number.
Inside first while loop take another while loop and find the sum of each digit of a number.
Then out side inner while loop, check if the sum value is more than one digit number(means greater than equal to 10), then again that sum value becomes the number value and first while loop executes again.
If sum value is a single digit number then print that sum value which is generic root value of original number.
*/

package GenericRoot;
import java.util.*;

public class GenericRoot {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = reader.nextInt();
        reader.close();
        int sum = 0;
        int n = 0;
        while(num >= 10){
            sum = 0;
            n = num;
            while(n!=0){
                int lastDigit = n%10;
                sum += lastDigit;
                n = n/10;
            }
            if(sum >= 10){
                num = sum;
            }
            else{
                System.out.println("Sum of digits until a single digit is : "+sum);
                break;
            }
        }
    }
}
