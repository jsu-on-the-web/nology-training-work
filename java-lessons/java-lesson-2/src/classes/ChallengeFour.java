package classes;

/*
 *   In your main function:
     * instantiate a dog that woofs
     * ... a bear that roars
     * print each of their sounds to the console
 */
public class ChallengeFour {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", "Buddy", "woof");
        Animal bear = new Animal("bear", "Grizzly", "roar");
        Animal cat = new Animal();

        System.out.println(String.format("%s the %s says: %s", dog.getName(), dog.getSpecies(), dog.getSound()));
        System.out.println(String.format("%s the %s says: %s", bear.getName(), bear.getSpecies(), bear.getSound()));
        System.out.println("The next animal is the default animal.");
        System.out.println(String.format("%s the %s says: %s", cat.getName(), cat.getSpecies(), cat.getSound()));
    }
}
