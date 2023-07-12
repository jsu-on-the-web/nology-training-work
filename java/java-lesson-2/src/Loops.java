public class Loops {
    public static void main(String[] args) {
        
        // We saw an example of while loop in Switch.java

        // For loop
        for (int i = 0; i <= 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }

        // For in
        System.out.println("A number array, each item doubled");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            System.out.println(number * 2);
        }
    }
}
