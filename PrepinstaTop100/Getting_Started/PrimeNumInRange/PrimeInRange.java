package Getting_Started.PrimeNumInRange;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter range:");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        reader.close();
        int flag;

        System.out.println("Set of Prime  numbers b/w "+num1+" and "+num2+" are : ");
        for(int x=num1; x<=num2; x++){
            flag = 0;
            for(int i=2; i<x; i++){
                if(x%i==0){
                    flag++;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(x);
            }
        }
    }
}
