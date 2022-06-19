package Getting_Started.FriendlyPair;
import java.util.*;
public class FriendlyPair {
    static int sumOfDivisors(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        reader.close();
        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);
        if(sum1/num1 == sum2/num2){
            System.out.println("Yes, they are a friendly pair");
        }
        else{
            System.out.println("No, they are not a friendly pair");
        }
    }
}
