public class GenericsMain {
    public static void main(String[] args) {
        TopThreeList<String> t = new TopThreeList<>("one", "two", "three");

        TopThreeList<Integer> i = new TopThreeList<>(1, 2, 3);

        String[] s = {"one", "two", "three"};
        double[] d = {1.0, 2.0, 3.0};
        PrintArray.printStringArray(s);
        PrintArray.printAnyArray(s);
        PrintArray.printDoubleArray(d);
    }
}
