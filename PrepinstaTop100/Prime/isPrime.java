
package Prime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        int flag = 0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                flag ++;
                break;
            }
        }
        if(flag == 0){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " is not prime");
        }
    }
}
