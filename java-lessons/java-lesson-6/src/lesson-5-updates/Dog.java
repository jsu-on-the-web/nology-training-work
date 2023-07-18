
public class Dog implements MakesASound, DoesEat {
    
    @Override 
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String eat() {
        return "That was a delicious bone!";
    }
}
