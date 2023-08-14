import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Algo6new {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    loop:
        do {
            System.out.print("Enter a text: ");
            String text = scanner.nextLine().strip();
            char[] textStr = text.toCharArray();
            if (text.isEmpty()) {
                System.out.println("Please enter a valid text");
                continue;
                
            }
            int wordCount = 1;

            for (int i = 0; i < textStr.length; i++) {
                if (textStr[i]>128) {
                    System.out.println("Only ASCII characters are supported");
                    continue loop;
                }
                if (textStr[i]==' ') {
                    wordCount ++;
                }
            }
            String[] words = new String[wordCount];
            int k = 0;
            
            for (int j = 0; j < textStr.length; j++) {
                if (Character.isSpaceChar(textStr[j])){
                    String word = text.substring(k, j);
                    k = j + 1;
                    words[--wordCount] = word;
                
                }
            }
            
            String word = text.substring(k);
            words[0] = word;

            System.out.println(Arrays.toString(words));
            System.out.println(String.join(" ", words));
            // for (int i = 0; i < words.length; i++) {
            //     System.out.print(words[i] + " ");
            // }
            // System.out.println();
            
        }while(true);
    
    }
}
