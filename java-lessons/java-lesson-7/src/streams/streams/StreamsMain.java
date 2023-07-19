package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {
    public static void main(String[] args) {
        Integer[] i = { 1, 2, 3 };
        Integer[] iDoubled = new Integer[i.length];

        // * Using a for loop
        for (int j = 0; j < i.length; j++) {
            iDoubled[j] = i[j] * 2;
        }
        System.out.println("Doubling with a for-loop: " + Arrays.toString(iDoubled));

        // * Using streams
        Stream<Integer> integerStream = Stream.of(i);
        Stream<Integer> doubledIntegerStream = integerStream.map(StreamMathHelper::doubleNumber);
        // Convert back to an array
        Integer[] doubledStreamArray = doubledIntegerStream.toArray(Integer[]::new);

        System.out.println("Doubling with a stream: " + Arrays.toString(doubledStreamArray));

        // * Using a lambda function with a stream
        Integer[] i2 = { 1, 2, 3, 4, 5, 6 };
        Integer[] lambdaDouble = Stream.of(i2).map(num -> num * 2).toArray(Integer[]::new);
        System.out.println("Double i2 with a lambda: " + Arrays.toString(lambdaDouble));

        // * Using .filter()
        Integer[] moreThanThree = Stream.of(i2).filter(num -> num > 3).toArray(Integer[]::new);
        System.out.println("More than three: " + Arrays.toString(moreThanThree));

        /**
         * ======================
         ** ArrayList
         * ========================
         **/
        ArrayList<String> names = new ArrayList<String>(Arrays
                .asList("John", "Paul", "George", "Ringo")); // * Using asList is a quicker way of initializing the
                                                             // values of an ArrayList
        System.out.println("Names: " + names);

        ArrayList<String> fiveLetterNames = new ArrayList<String>();
        // * Using a for loop
        for (String name : names) {
            if (name.length() == 5) {
                fiveLetterNames.add(name);
            }
        }

        System.out.println("Five letter names: " + fiveLetterNames);

        ArrayList<String> fourLetterNames = names.stream()
                .filter(name -> name.length() == 4)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Four letter names: " + fourLetterNames);

        // * Monads
        Optional<String> startsWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();

        if (startsWithA.isPresent()) {
            System.out.println("Starts with A: " + startsWithA.get());
        }

    }
}
