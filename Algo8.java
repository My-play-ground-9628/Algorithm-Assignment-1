import java.util.Scanner;

public class Algo8 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        System.out.print("numA \u2229 numB {");
        for (int i = 0; i < numB.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i]==numB[j]) {
                    System.out.print(numA[i] + ", ");
                }
                
            } 
        }
        System.out.print("\b\b}\n");
        
    }
    
}
