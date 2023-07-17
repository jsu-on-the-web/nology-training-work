package inheritance;

import inheritance.ChallengeSeven.Person;

public class InheritanceRunner {
    public static void main(String[] args) {
        // Track track = new Track("My Title", 10.5f, "mp3");
        // track.printTrackInfo();

        // Song song = new Song("My Title", 10.5f, "mp3", "My Artist");
        // song.printTrackInfo();


        // Podcast podcast = new Podcast("My Title", 10.5f, "mp3", new String[]{"John Doe", "Jane Doe"});
        // podcast.printTrackInfo();

        Person person = new Person("John Doe");
        person.sayYourName();
    }
}
