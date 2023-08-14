import java.util.Arrays;
import java.util.Scanner;

public class Algo3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] numsNew = new int[5];

        for (int i = 4; i > -1; i--) {
            int index = 0;
            index = nums[i];
            numsNew[4-i] = index;
               
            
            
        
            
        }
        System.out.println(Arrays.toString(nums));
        
        nums = numsNew;

        System.out.println(Arrays.toString(nums));
        
        // System.out.print("Nums = [");
        // for (int k = 0; k < nums.length; k++) {
        //     System.out.print(nums[k]+",");
          
        // }
        // System.out.println("\b"+ "]");  
        

    }
    
}
