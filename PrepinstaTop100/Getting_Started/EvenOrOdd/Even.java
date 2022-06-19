package Getting_Started.EvenOrOdd;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        int num = reader.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        reader.close();
    }
}
