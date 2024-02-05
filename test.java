import java.util.Scanner;

# Branch out
# This is a small change
public class test
{
    public static void main(String[] args)
    {
        // ========== Declaring variables ==========

        // An integer for the array size.
        int arraySize = 0;

        // A double for the current element.
        double element = 0.0;

        // A scanner object for requesting input from System.in.
    	Scanner object = new Scanner(System.in);

        // ========== Request Array size from user ==========

        // Print this message "How many elements in the array: "
        System.out.println("How many elements in the array: ");

        // Request an integer from the user using the Scanner object
        // and store the inputed value in the integer declared above.
        arraySize = object.nextInt();

        // ========== Declare the array ==========

        // Declare a new array of double values.
        // The size of the array is equal to the size requested
        double[] doubleArray = new double[arraySize];

        // ========== Fill in the array ==========

        // Use a for loop to prompt the user for the content of the array
        for(int i = 0; i < arraySize; i++)
        {
        	System.out.println("Please enter the next value: ");
            doubleArray[i] = object.nextDouble();
        }

        // ========== Display the array's elements backward ==========

        // Construct a for loop that runs backwards through the array,
        // starting at the last element and ending at the first.
        for(int i = doubleArray.length - 1; i >= 0; i--)
        {
        	System.out.print(doubleArray[i] + " ");
        }
        System.out.println();

        // ========== Display the sum ==========

        // Call the method sumArray with the user's array and display the sum
        // end with a newline character.
        System.out.println("The sum of the array's elements is: " + sumArray(doubleArray) + "\n");

        // Close Scanner object
        object.close();
    }	// end main

    //	This method calculates and returns the sum of array
    public static double sumArray(double[] arr)
    {
        double sum = 0.0;

        for(int i = arr.length - 1; i >= 0; i--)
        {
        	sum += arr[i];
        }
        return sum;
    }
}
