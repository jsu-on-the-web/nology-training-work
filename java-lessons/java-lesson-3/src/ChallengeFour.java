/* Challenge: Find Area Method
MVP:
Create method called findArea
It should take in a single parameter
radius (of the circle)
It should return the area of the circle
Challenge: Fullname Method
MVP:
Create a method called fullName,
It should take in 2 parameters:
firstName
lastName
It should return a full name
Challenge: Firstname Method
MVP:
Create a method called fullName,
It should take in 1 parameter:
fullName
It should return a first name */

public class ChallengeFour {
    public static double findArea(double radius){
        return Math.round((Math.PI * Math.pow(radius, 2) ) * 100.0) / 100.0;
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static String firstName(String fullName){
        return fullName.split(" ")[0]; // Split by space and return the first thing in the resulting array
    }

	public static void main(String[] args) {
        System.out.println(String.format("Area of circle with radius %s is %s", 3.5, findArea(3.5)));
        System.out.println(String.format("Full name is %s", fullName("Janet", "Suryadi")));
        System.out.println(String.format("First name is %s", firstName("Janet Suryadi")));
    }
}