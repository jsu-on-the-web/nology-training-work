/* Challenge: Date Formatter
Create a method that takes a long of "seconds" and returns
a string in the format "11h02m23s"
For example, 4000 seconds would be "01h06m40s"
Test the method by running it from Main
Challenge: Date Formatter Extension
Now add another parameter for minutes with the same name (method overriding)
ideal solution is to call the method that takes seconds inside the method that takes in minutes and seconds */

import DateFormatting;

public class ChallengeFive {

    public static void main(String[] args) {
        DateFormatting df = new DateFormatting();
        System.out.println(df.DateFormatter(36567L));
        System.out.println(df.DateFormatter(3600L));
        System.out.println(df.DateFormatter(60L));
        System.out.println(df.DateFormatter(30L));

        System.out.println(df.DateFormatter(40L, 30L));
    }
}
