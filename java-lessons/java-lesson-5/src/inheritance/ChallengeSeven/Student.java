package inheritance.ChallengeSeven;

public class Student extends Person {
    String cohort;
    public Student(String name, String cohort) {
        super(name);
        this.cohort = cohort;
    }

    @Override
    public void sayYourName() {
        System.out.println("Hello, my name is " + this.name + " from the " + this.cohort + " cohort");
    }
}
