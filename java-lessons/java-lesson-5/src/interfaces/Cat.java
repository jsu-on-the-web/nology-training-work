package interfaces;

public class Cat implements MakesASound {
    @Override
    public String makeSound() {
        return "Meow";
    }
}
