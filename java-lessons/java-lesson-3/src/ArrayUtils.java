/* MVP:
Create a class called ArrayUtils
Create a static method that takes in an int[]
... and returns a new int[] where all numbers have been incremented
Input => Output Examples:
{ 1, 2, 3 } => { 2, 3, 4 }
{ 45, 23 } => { 46, 24 }
{ } => { }
Challenge: Reverse Items in an Array
Create a static method that takes in int[] on your ArrayUtils class
... and returns a new int[] where all the items are in the reverse order
Input => Output Examples:
{ 1, 2, 3 } => { 3, 2, 1 }
{ 45, 23 } => { 23, 45 }
{ } => { } */
 
public class ArrayUtils {
    
    /**
     * Increments each element in the given array by 1.
     *
     * @param  numbers  the array of numbers to be incremented
     * @return          the resulting array with each element incremented by 1
     */
    public static int[] increment(int[] numbers) {
        int[] output = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            output[i] = numbers[i] + 1;
        }
        return output;
    }

    /**
     * Reverses the order of the elements in an array of integers.
     *
     * @param  numbers  the array of integers to be reversed
     * @return          the array of integers with the elements reversed
     */
    public static int[] reverse(int[] numbers) {
        int[] output = new int[numbers.length];
        int iter = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            output[iter - 1] = numbers[i];
            iter--;
        }
        return output;
    }
}
