package AbundantNumber;
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        int sum = 0;
        for(int i=1; i<num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        if(sum > num){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not Abundant Number");
        }
    }
}
