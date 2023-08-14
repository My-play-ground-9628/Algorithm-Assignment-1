import java.util.Scanner;

public class Algo9 {
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
            boolean palindrome = true;
            do{
                for (int j= 0; j < invert.length; j++) {
                if (invert[j]!=textStr[j]) {
                    System.out.println(text + " isn't a palindrome");
                    palindrome = false;
                    break;
                }
            
                if (j==invert.length-1){
                    palindrome = false;
                System.out.println(text + " is Palindrome");
                }

            }
            }while(palindrome);
    
    
    }while(true);
}
}
