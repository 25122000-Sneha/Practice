package Getting_Started.FactorialOfANum;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
}
