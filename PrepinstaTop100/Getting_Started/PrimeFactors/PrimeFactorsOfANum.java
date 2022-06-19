package Getting_Started.PrimeFactors;
import java.util.*;
public class PrimeFactorsOfANum {

    public static void findPrimeFactors(int num){
        System.out.println("Prime factors of "+num+" are :");
        for(int i=2; num>1; i++){
            while(num%i == 0){
                System.out.print(i+" ");
                num = num / i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        PrimeFactorsOfANum.findPrimeFactors(num);
    }
}
