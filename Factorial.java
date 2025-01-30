import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Initialize the result variable to 1
        int factorial = 1;
        
        // Calculate factorial using a for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply factorial by i in each iteration
        }
        
        // Output the result
        System.out.println("Factorial of " + num + " is " + factorial);
        
        sc.close();
    }
}
