import java.util.ArrayList;
import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.print("Enter a text: ");
            String text = scanner.nextLine();
            char[] textStr = text.toCharArray();
            if (text.isEmpty()) {
                System.out.println("Please enter a valid text");
                continue;
            }

            int wordCount = 1;
            for (int i = 0; i < textStr.length; i++) {
                if (textStr[i]==' ') {
                    wordCount += 1;
                }
            }
            // System.out.println(wordCount);
            ArrayList<String> words = new ArrayList<String>();
            int[] spaceIndex = new int[wordCount];
            spaceIndex[0] = 0;
            int count = 0;
            for (int j = 0; j < textStr.length; j++) {
                if (textStr[j]==' ') {
                    count += 1;
                    spaceIndex[count] = j;
                    
                }
                        
            }
            
        for (int k = 0; k < spaceIndex.length; k++) {
                if (k == spaceIndex.length-1) {
                    words.add(k,(text.substring(spaceIndex[k],text.length()).strip()));
                }else {
                    words.add(k,(text.substring(spaceIndex[k],spaceIndex[k+1]).strip()));

                }       
             
            }
        String longest = "";
        String shortest = words.get(0);
        for (int a = 0; a < spaceIndex.length; a++) {
            if (words.get(a).length()>longest.length()) longest = words.get(a);
       
        } 
        System.out.println("Longest word is:"+ longest);
        System.out.println("Length of longest word is: " + longest.length());
        

        for (int b = 0; b < spaceIndex.length; b++) {
            if (words.get(b).length()<longest.length()) longest = words.get(b);
            
        } 
        System.out.println("SHortest word is: "+ shortest);
        System.out.println("Length of shortest word is: " + shortest.length());


        }while(true);    
    }
    
}
