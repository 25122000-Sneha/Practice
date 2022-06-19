package Getting_Started.SumInRange.SumInRange;
import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int sum = 0;
        for(int i=num1; i<num2; i++){
            sum += i;
        }
        System.out.println(sum);
        reader.close();
    }
}
