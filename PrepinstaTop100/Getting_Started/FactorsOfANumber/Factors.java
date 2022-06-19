package Getting_Started.FactorsOfANumber;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        System.out.println("Factors of "+num+" are :");
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
