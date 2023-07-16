import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChallengeThree {
    public static void main(String[] args) {
        /* Scanner s = new Scanner(System.in);
        
        // Challenge: Rounding Floats
        System.out.println("Please give me two floats");
        float a = (float) Math.round(a * 1000) / 1000;
        float b = (float) Math.round(b * 1000) / 1000;
        // BigDecimal a = new BigDecimal(String.valueOf(s.nextFloat())).setScale(3, RoundingMode.HALF_UP);
        // BigDecimal b = new BigDecimal(String.valueOf(s.nextFloat())).setScale(3, RoundingMode.HALF_UP);

  

        if (a == b) {
            System.out.println(a + " is equal to " + b + " after rounding");
        } else {
            System.out.println(a + " is not equal to " + b);
        }

        // Challenge: What's the number of x in y?
        final int SECONDS = 60;
        final int MINUTES = 60;
        final int HOURS = 24;
        final int DAYS = 365;
        final int WEEKS = 52;
        final int MONTHS = 12;

        System.out.println("What number of x in y?");
        System.out.println("Enter two characters. Valid characters are 's' for seconds, 'm' for minutes, 'h' for hours, 'd' for days, 'w' for weeks, 'M' for months, 'Y' for years'.");
        char x = s.next().charAt(0);
        char y = s.next().charAt(0);

        // Using Map to get a key-value pair
        Map<Character, Long> conversionMap = new HashMap<>();
        conversionMap.put('s', (long) SECONDS);
        conversionMap.put('m', (long) (SECONDS * MINUTES));
        conversionMap.put('h', (long) (SECONDS * MINUTES * HOURS));
        conversionMap.put('d', (long) (SECONDS * MINUTES * HOURS * DAYS));
        conversionMap.put('w', (long) (SECONDS * MINUTES * HOURS * DAYS * WEEKS));
        conversionMap.put('M', (long) (SECONDS * MINUTES * HOURS * DAYS * MONTHS));
        conversionMap.put('Y', (long) (SECONDS * MINUTES * HOURS * DAYS * WEEKS * MONTHS));

        if (conversionMap.containsKey(x) && conversionMap.containsKey(y)) {
            long xValue = conversionMap.get(x);
            long yValue = conversionMap.get(y);

            if (xValue == 0) {
                System.out.println("There are no " + y + "s in a " + x);
            } else if (yValue == 0) {
                System.out.println("There are no " + x + "s in a " + y);
            } else {
                long result = yValue / xValue;
                System.out.println("There are " + result + " " + y + "s in a " + x);
            }
        } else {
            System.out.println("Invalid input");
        } */

        // ! なんでことだ I'll figure out an efficient way to do this out sooner or later 

    }
}
