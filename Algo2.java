import java.util.Scanner;

public class Algo2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        int max = nums[0];
        int min = nums[0];
        boolean maximum = true;
        boolean minimum = true;

        do{
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    int maxNew = nums [i];
                    max = maxNew;
                }
                if (max == nums[nums.length-1]) {
                    maximum = false;
                }
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    int minNew = nums [j];
                    min = minNew;
                }
                if (min == nums[nums.length-1]) {
                    minimum = false;
                }
              
            }

            
        }  
        System.out.println("Largest number is: " + max);
        System.out.print("Smallest number is: " + min);
        System.out.println();

        }while(!maximum && !minimum); 
    
    }
}