package Strings.FrequencyOfChars;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        reader.close();
        int freq = 0;

        char[] arr = str.toCharArray();

        for(int i=0; i<str.length() ; i++){
            if(arr[i] == '0' || arr[i] == ' ')
            {
                continue;                      //skip current iteration and go to next
            }
            freq = 1;
            char ch = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    freq++;
                    arr[j] = '0';
                }
            }
            arr[i] = '0';
            System.out.println("Frequency of char "+ch+" is "+freq);
        }
        
    }
}
