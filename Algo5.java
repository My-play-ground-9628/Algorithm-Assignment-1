import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        loop:
        do {
            System.out.print("Enter a text: ");
            String text = scanner.nextLine().strip();
            char[] textStr = text.toCharArray();
            if (text.isEmpty()) {
                System.out.println("Text can't be empty");
                continue;
                
            }
            for (int i = 0; i < textStr.length; i++) {
                if (textStr[i]>128) {
                    System.out.println("Only ASCII characters are supported");
                    continue loop;
                }
            }
            

            int a = text.length()-1;
            char[] invert = new char[text.length()];
            for (int i = (text.length() - 1); i > -1; i--) {
                invert[i] = textStr[a-i];
                
            

                
            }
            System.out.print("Invert of the text " + text + " is: ");
            for (int j = 0; j < invert.length; j++) {
                System.out.print(invert[j]);

            }
            System.out.println();
        


            break;

        }while(true);
        


        
    }
    
}
