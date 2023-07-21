package testing;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Utils {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double divide(double a, double b) {

        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }

    // A method that takes in an arraylist of ints and returns unique values
    public static ArrayList<Integer> unique(ArrayList<Integer> arr) {
        if (arr.size() == 0) {  
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> unique = arr
                .stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        return unique;
    }
}
