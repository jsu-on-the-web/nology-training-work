package classes;

    /*
     * Create a new class called Animal
     * It should have a species property (for the name of the animal, e.g cat, dog)
     * It should have a name property (for the name of the animal, e.g cat, dog)
     * It should have a sound property (for the noise is makes, e.g oink)
     * It should default to a cat that meows
     * It should have a constructor that sets name and sound based on arguments
     */

public class Animal {
    private String species;
    private String name;
    private String sound;


    // * Constructors
    // Note: You can overload methods (methods with the same name but different parameters)
    public Animal(String species, String name, String sound){
        setName(name);
        setSpecies(species);
        setSound(sound);
    }

    public Animal() {
        setSpecies("cat");
        setName("Whiskers");
        setSound("meow");
    }

    //* Getters 
    public String getSpecies(){
        return species;
    }

    public String getName(){
        return name;
    }

    public String getSound(){
        return sound;
    }

    //* Setters
    public void setSpecies(String species){
        if (species == null || species.equals("")) {
            throw new IllegalArgumentException("Species cannot be null");
        } else {
            this.species = species;
        }
    }

    public void setName(String name){
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null");
        } else {
            this.name = name;
        }
    }

    public void setSound(String sound){
        if (sound == null || sound.equals("")) {
            throw new IllegalArgumentException("Sound cannot be null");
        } else {
            this.sound = sound;
        }

        // ? Consider having a list of sounds that correspond to a list of species
    }
}
