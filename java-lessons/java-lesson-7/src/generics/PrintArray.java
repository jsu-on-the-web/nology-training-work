public class PrintArray {
    /**
     * ==============================================
     * * TYPED METHODS
     * =============================================
     **/
    public static void printStringArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void printDoubleArray(double[] array) {
        for (double d : array) {
            System.out.println(d);
        }
    }

    public static void printCharArray(char[] array) {
        for (char c : array) {
            System.out.println(c);
        }
    }

    public static void printBooleanArray(boolean[] array) {
        for (boolean b : array) {
            System.out.println(b);
        }
    }

    /**
     * ==============================================
     * * GENERIC METHOD
     * =============================================
     **/

    /**
     * Prints each element of the given array on a new line.
     * With this version of the method, you don't need to specify the type of the array, making the typed versions redundant.
     *
     * @param  array  the array to be printed
     */
    public static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
