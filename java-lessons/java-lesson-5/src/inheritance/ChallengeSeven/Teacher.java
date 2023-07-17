package inheritance.ChallengeSeven;

public class Teacher extends Person {
    
    public Teacher(String name) {
        super(name);
    }

    public void callMeeting(Person person) {
        System.out.printf("%s is currently calling %s into a meeting", this.name, person.getName());
    }

}
