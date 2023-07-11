package test;

public class Strings {
    public static void main(String[] args) {
        // Strings
        // Strings are objects and are mutable. 

        String str = "Hello World!";
        System.out.println(str.toUpperCase());


        // We can represent them as arrays of characters
        //  On the topic of arrays, arrays have to have their lengths assigned to them
        char[] exampleName = new char[4];
        exampleName[0] = 'J';
        exampleName[1] = 'O';
        exampleName[2] = 'H';
        exampleName[3] = 'N';
        System.out.println(exampleName);

        // We got string concatenation too!
        String str2 = "Selamat pagi, dunia!";
        System.out.println(str+ ' ' + str2);

        // But no string interpolation... (No doing console.log(Hello ${firstName + ' ' + lastName}))
        // Closest thing is String.format()
        // String.format() is a method of the String class that can be used to format strings with variables in them.
        String userName = "John Doe";
        int usersAge = 42;
        System.out.println(String.format("%s is %d years old.", userName, usersAge));
    } 

}
