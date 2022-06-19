package Getting_Started.SumOfFirstNnaturalNo.SumOfFirstNnaturalNo;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
        reader.close();
    }
}
