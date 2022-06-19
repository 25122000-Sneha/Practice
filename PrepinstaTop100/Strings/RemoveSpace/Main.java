package Strings.RemoveSpace;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();
        String newStr = str.replace(" ", "");
        System.out.println("String after removing spaces: "+newStr);
    }
}
