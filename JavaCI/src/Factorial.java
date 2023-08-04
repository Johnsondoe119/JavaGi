// This is a Java class named Factorial
public class Factorial {

    // This is a public static method named factorial that takes an integer n as input and returns an integer result
    public static int factorial(int n) {
        // Initialize a variable 'result' with the value 1, which will store the factorial of 'n'
        int result = 1;

        // Start a for loop that runs from 1 to 'n' (inclusive)
        // This loop will calculate the factorial of 'n'
        for (int i = 1; i <= n; i++) {
            // Multiply 'result' by 'i' and store the result back in 'result'
            // This will calculate the product of all the numbers from 1 to 'n'
            // For example, for n = 5, result = 1 * 1 * 2 * 3 * 4 * 5 = 120
            result *= i;
        }

        // Return the final value of 'result', which will be the factorial of 'n'
        return result;
    }

    // This is the main method, which serves as the entry point of the program
    public static void main(String[] args) {
        // Create a variable 'number' and assign it the value 5
        int number = 5;

        // Call the factorial method with 'number' as the argument and store the result in 'result'
        // The factorial method will calculate the factorial of 'number' (which is 5 in this case)
        int result = factorial(number);

        // Print the result to the console using System.out.println()
        System.out.println("Factorial of " + number + " is: " + result);
        // This will output: "Factorial of 5 is: 120"
    }
}
