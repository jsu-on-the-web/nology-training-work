public class Equality {
	public static void main(String[] args) {
        // if else is similar to Javascript, just without stuff that relies on loose typing 
        
        byte age = 18;
        boolean isCitizen = true;
        if (age >= 18 && isCitizen) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote!");            
        }

        //Else if
        String country = "au";
        if (age >= 21) {
            System.out.println("You can drink in America");
        } else if (age >= 18 && country.equals(country)) {
            System.out.println("You can drink in Australia");
        } else {
            System.out.println("No alcohol for you");
        }
    }
}