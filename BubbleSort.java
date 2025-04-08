/**.
* This program will generate a random array of integers,
* sort it using the bubble sort algorithm
*
* @author Remy Skelton
* @version 1.0
* @since 2025-04-06
*/

final class BubbleSort {

    /**
     * This is a constant for the array size.
     */
    public static final int ARRAY_SIZE = 10;

    /**
     * This is a constant for the maximum random number.
     */
    public static final int MAX_RANDOM_NUMBER = 100;

    /**
     * This is a constant for the minimum random number.
     */
    public static final int MIN_RANDOM_NUMBER = 1;

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private BubbleSort() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) throws Exception {

        // Welcome message
        System.out.println("Welcome to the Bubble Sort program!");
        System.out.println("This program will generate a random array of");
        System.out.println("integers,and sort it using the bubble sort"
            + "method.");

        // Create an array of random integers
        int[] randomArray = new int[ARRAY_SIZE];

        // For loop to generate random integers between 1 and 100
        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = (int)
            (Math.random() * (MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER);
        }

        // Display the unsorted array
        System.out.println("Unsorted array:");

        // For loop to display the unsorted array
        for (int index = 0; index < randomArray.length; index++) {
            System.out.print(randomArray[index] + " ");
        }
        System.out.println();

        // Sort the array using bubble sort method
        int[] sortedArray = bubbleSort(randomArray);

        // Display the sorted array
        System.out.println("Sorted array:");
        // For loop to display the sorted array
        for (int index = 0; index < sortedArray.length; index++) {
            System.out.print(sortedArray[index] + " ");
        }
        System.out.println();

    }

    /**
     * This method sorts an array using the bubble sort algorithm.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] bubbleSort(final int[] array) {
        // For loop to compare each element in the array
        for (int pass = 0; pass < array.length - 1; pass++) {
            // For loop to compare adjacent elements
            for (int counter = 0;
                    counter < array.length - 1 - pass;
            counter++) {
                // If the current element is greater than the next element
                if (array[counter] > array[counter + 1]) {
                    // Swap the elements
                    int temp = array[counter];
                    array[counter] = array[counter + 1];
                    array[counter + 1] = temp;
                }
            }
        }
        // Return the sorted array
        return array;

    }
}
