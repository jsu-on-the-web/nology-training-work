package interfaces;

public class Dog implements MakesASound {
    
    @Override 
    public String makeSound() {
        return "Woof";
    }
}
