import java.util.Scanner;

public class Algo1 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    
        do{
            int[] FibArray = {0, 1};
            System.out.print("Enter a positive number : ");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num < 0) {
                System.out.println("Please enter a valid number!");
                break;
            }

            boolean exit = false;
            int z = 0;
            int[] fibo = new int [num];
            String series = "";
            
            do {
                if (z > num) exit = true;
                else if (num == 0) {
                    series = "0";
                    exit = true;
                }
                else if (num == 1) {
                    series = "0, 1, 1";
                    exit = true;
                }
                else {
                    series = "0, 1, ";
                    for (int i = 0; i < num; i++) {
                        z = FibArray[0] + FibArray[1];
                        if (z > num) {
                            exit = true;
                            series += "\b\b" +" ";
                            break;
                        
                        }else {
                            FibArray[0] = FibArray[1];
                            FibArray[1] = z;
                            series += z + ", ";
                            if (z == num) {
                                exit = true;
                                series += "\b\b" +" ";
                                break;
                            }

                        }
                        
                    }
                

                }
                 
                System.out.print("Fibonacci series upto " + num + " is: " + series);
                System.out.println();    

            }while (!exit);

        }while(true);


        
    }
    
}
