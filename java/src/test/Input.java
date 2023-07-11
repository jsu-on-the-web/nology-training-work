package test;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Getting input from the console
        // We can make use of the Scanner library to use its functionality for this task 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your age");
        int age = s.nextInt();
        System.out.println("Your age is " + age);

        s.close(); // Remember to close the scanner when you're done to avoid memory leaks
    }
}
