public class MathHelper {
    // We want this to support multiple data types, but not all of them.
    // Additionally, some data types will have access to certain methods.

    public static <T extends Comparable> T max(T a, T b) {
        // * The Comparable interface is used to implement methods that compare two objects with each other.
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
