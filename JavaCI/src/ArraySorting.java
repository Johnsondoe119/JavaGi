// Import the Arrays class from java.util package to use the sort() method for array sorting
import java.util.Arrays;

// This is a Java class named ArraySorting
public class ArraySorting {

    // This is the main method, which serves as the entry point of the program
    public static void main(String[] args) {
        // Create an integer array named 'numbers' and initialize it with values {5, 2, 8, 1, 9}
        int[] numbers = {5, 2, 8, 1, 9};

        // Use the Arrays.sort() method to sort the 'numbers' array in ascending order
        Arrays.sort(numbers);

        // Print a message to the console
        System.out.print("Sorted Array: ");

        // Use an enhanced for loop (also known as for-each loop) to iterate through each element in the 'numbers' array
        // and print each element followed by a space
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        // This will output: "Sorted Array: 1 2 5 8 9"
    }
}
