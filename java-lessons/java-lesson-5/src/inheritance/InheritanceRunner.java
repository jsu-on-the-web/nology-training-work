package inheritance;

import inheritance.ChallengeSeven.Person;
import inheritance.ChallengeSeven.Student;
import inheritance.ChallengeSeven.Teacher;

public class InheritanceRunner {
    public static void main(String[] args) {
        // Track track = new Track("My Title", 10.5f, "mp3");
        // track.printTrackInfo();

        // Song song = new Song("My Title", 10.5f, "mp3", "My Artist");
        // song.printTrackInfo();


        // Podcast podcast = new Podcast("My Title", 10.5f, "mp3", new String[]{"John Doe", "Jane Doe"});
        // podcast.printTrackInfo();

        Teacher alex = new Teacher("Alex");
        Teacher calum = new Teacher("Calum");
        Student jason = new Student("Jason", "Wales");
        Student josh = new Student("Josh", "Venezuela");
        Student john = new Student("John", "Uruguay");

        Person[] people = {alex, calum, jason, josh, john};
        
        for (Person person : people) {
            person.sayYourName();
        }
        calum.callMeeting(alex);
        alex.callMeeting(jason);
        calum.callMeeting(josh);
    }
}
