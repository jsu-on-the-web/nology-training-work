package inheritance.ChallengeSeven;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayYourName() {
        System.out.println("Hello, my name is " + this.name);
    }

    public String getName() {
        return name;
    }
}
