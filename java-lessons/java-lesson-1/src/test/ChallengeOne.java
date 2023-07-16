package test;

import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        /*
         * - Create a byte, integer and double using the scanner to take input
         * - Create an integer that is the result of dividing your byte by a number
         * selected by the user
         * - Create a long by taking input from the user for a short and multiplying
         * that by another short
         */

         Scanner s = new Scanner(System.in);

         System.out.println("Give me a byte (-128 to 127)");
         byte b = s.nextByte();
         System.out.println("Give me an integer");
         int i = s.nextInt();
         System.out.println("Give me a double");
         double d = s.nextDouble();
         System.out.println("Give me an integer you want to divide the byte by, I'll round the result.");
         int bi = Math.round((b / s.nextInt()));
         System.out.println("Give me a short, I'll multiply it by a short (5) to get a long.");
         short sh = s.nextShort();
         sh *= 5;
         long l = (long) sh;

         System.out.println(String.format("Your byte is %d, your integer is %d and your double is %.2f", b, i, d));
         System.out.println(String.format("Your calculated integer is %d, your calculated long is %d", bi, l));

         s.close();
    }
}
