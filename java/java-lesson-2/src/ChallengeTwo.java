import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Challenge: Positive or Negative?
        System.out.println("Give me a byte (-128 to 127)");
        byte by = s.nextByte();
        if (by > 0) {
            System.out.println(by + " is a positive number");
        } else {
            System.out.println(by + " is a negative number");
        }

        // Challenge: Find the largest input
        System.out.println("Give me three integers. I'll see which is the biggest.");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the biggest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest");
        } else {
            System.out.println(c + " is the biggest");
        }

        // ? Try using Math.max() next time? Is there a version that lets us compare multiple numbers?
        
        s.close();
    }
}
