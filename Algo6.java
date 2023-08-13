import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Algo6 {
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
                    //System.out.print(text.substring(spaceIndex[k],text.length()).strip());
                    
            
                }else {
                    words.add(k,(text.substring(spaceIndex[k],spaceIndex[k+1]).strip()));
                    
                    //System.out.print(text.substring(spaceIndex[k],spaceIndex[k+1]).strip());
                }       
             
            }
        System.out.print("Invert of the words is: ");
        for (int a = spaceIndex.length - 1; a > -1; a--) {
            System.out.print(words.get(a)+" ");
                
        }   
            
            System.out.println();
        }while(true);
        

    }
    
}
