import java.util.Arrays;
import java.util.Scanner;

public class Algo4 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50}; 

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }

        // int temp = nums[0];
        // nums[0] = nums[nums.length-1];
        // nums[nums.length-1] = temp;

        // temp = nums[1];
        // nums[1] = nums[nums.length-1-1];
        // nums[nums.length-1-1] = temp;


        System.out.println(Arrays.toString(nums));



    }
    
}
