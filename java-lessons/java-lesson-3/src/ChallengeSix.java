import java.util.Arrays;

public class ChallengeSix {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.printf("This is the original array %s %n", Arrays.toString(numbers));
        System.out.printf("This is the array with every number incremented %s %n",
                Arrays.toString(ArrayUtils.increment(numbers)));
        System.out.printf("This is the array with its elements in reverse order %s %n",
                Arrays.toString(ArrayUtils.reverse(numbers)));

        int[] nullSet = {};
        System.out.printf("This is the original array %s %n", Arrays.toString(nullSet));
        System.out.printf("This is the array with every number incremented %s %n",
                Arrays.toString(ArrayUtils.increment(nullSet)));
        System.out.printf("This is the array with its elements in reverse order %s %n",
                Arrays.toString(ArrayUtils.reverse(nullSet)));
    }
}
