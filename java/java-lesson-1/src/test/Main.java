package test;

public class Main {
    public static void main(String[] args) {
        /*
         * String str = "Hello World!";
         * boolean isAllowedToType = false;
         * System.out.println(str.toUpperCase());
         * 
         * if (isAllowedToType) {
         * System.out.println("Come on and type some code!");
         * } else {
         * System.out.println("You're not allowed to type!");
         * }
         */

         System.out.println("Greetings Earth! \n" + "Let's get started!");
         System.out.print("This will appear on the same line ");
         System.out.print("as this one. \n");

         // Bytes
         byte b = 126;
         System.out.println(b);
         b++;
         System.out.println(b);
         // Overflow time!
         b++;
         System.out.println(b);

         // Shorts
         short s = 32767;
         System.out.println(s);
         s++;
         System.out.println(s);

         // Integers
         // Using underscores to separate big numbers. 
         int i = 123_456_789;
         System.out.println(i);
         int smallestInt = -2_147_483_648;
         System.out.println(smallestInt);
         int largestInt = 2_147_483_647;
         System.out.println(largestInt);
         smallestInt -= 2;
         System.out.println(smallestInt);

         // Longs
         // NOTE: Longs have to have an L at the end.
         long l = 123_456_789_123_456_789L;
         System.out.println(l);

         // Floats
         // NOTE: Floats have to have a f at the end. By default, Java will assume we mean double if we put in a decimal number.
         float f = 123.456f;

         // Doubles
         double d = 123.456;
         System.out.println(d);

         // Booleans - literally only 1 bit, since there's only true and false, two states!
         boolean b1 = true;
         boolean b2 = false;
         System.out.println(b1);
         System.out.println(b2);

         // Char
         // NOTE: Char is a single byte. You also need to represent it with single quotes ('')! Double quotes ("") is for Strings.
         char c = 'A';
         System.out.println(c);
    }
}
