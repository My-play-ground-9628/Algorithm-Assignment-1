import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        do {
            System.out.print("Enter a text: ");
            String text = scanner.nextLine();
            char[] textStr = text.toCharArray();
            if (text.isEmpty()) {
                System.out.println("Please enter a text");
                
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
        



        }while(true);
        


        
    }
    
}
