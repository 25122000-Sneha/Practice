package Getting_Started.PowerOfNumber;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter base: ");

        int base = reader.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = reader.nextInt();
        int power = (int)Math.pow(base, exponent);
        System.out.println(base+" to the power "+exponent+" is "+power);
        reader.close();
    }

}
