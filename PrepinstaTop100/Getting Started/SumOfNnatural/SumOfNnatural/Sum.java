package SumOfNnatural;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
        reader.close();
    }
}
