// This is a Java class named PrimeNumber
public class PrimeNumber {

    // This is a public static method named isPrime that takes an integer number as input and returns a boolean
    // It checks if the given 'number' is a prime number or not
    public static boolean isPrime(int number) {
        // If the 'number' is less than or equal to 1, it is not a prime number
        if (number <= 1) {
            return false;
        }

        // Start a for loop that runs from 2 to 'number' (exclusive)
        // We start from 2 because 1 and 'number' are divisors for all numbers, and we don't want to include them
        for (int i = 2; i < number; i++) {
            // Check if 'number' is divisible by 'i'
            // If it is, then 'number' is not a prime number, so return false
            if (number % i == 0) {
                return false;
            }
        }

        // If the loop completes without finding any divisors for 'number', it is a prime number, so return true
        return true;
    }

    // This is the main method, which serves as the entry point of the program
    public static void main(String[] args) {
        // Create a variable 'number' and assign it the value 17
        int number = 17;

        // Call the isPrime method with 'number' as the argument and store the result in a boolean variable 'isPrime'
        // The isPrime method will check if 'number' is a prime number or not
        boolean isPrime = isPrime(number);

        // Check the value of 'isPrime' and print the appropriate message to the console using System.out.println()
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        // This will output: "17 is a prime number."
    }
}
