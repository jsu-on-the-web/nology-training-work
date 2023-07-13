public class Arrays {
    public static void main(String[] args) {
        String[] countries = {"Australia", "United States of America", "Chad", "Argentina", "France", "Taiwan"};
        for (String country : countries) {
            System.out.println(country);
        }

        System.out.println(String.format("I live in %s", countries[0]));
 
        System.out.println(java.util.Arrays.toString(countries)); // gotta call the method in this ugly way because this lesson class is also called Arrays, whoops

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(numbers));
        int[] newNumbers = new int[5];
        System.out.println(java.util.Arrays.toString(newNumbers));
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length); //aeugh
        newNumbers[0] = 10;
                System.out.println(java.util.Arrays.toString(newNumbers));

        // Way better way is to use Arrays.copyof
        int[] yetMoreNewNumbers = java.util.Arrays.copyOf(newNumbers, newNumbers.length);
        yetMoreNewNumbers[3] = 100;
        System.out.println(java.util.Arrays.toString(yetMoreNewNumbers));

        // Another way, use a for-loop
        int[] somehowMoreNewNumbers = new int[newNumbers.length];
        for (int i = 0; i < newNumbers.length; i++) {
            somehowMoreNewNumbers[i] = newNumbers[i];
            somehowMoreNewNumbers[i] *= 2;
        }

        System.out.println(java.util.Arrays.toString(somehowMoreNewNumbers));

    }
}
