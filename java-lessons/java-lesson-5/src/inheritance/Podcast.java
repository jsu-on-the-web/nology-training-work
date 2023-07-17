package inheritance;

public class Podcast extends Track {
    String[] guests;
    public Podcast(String title, float length, String fileExtension, String[] guests) {
        super(title, length, fileExtension);
        // TODO: Make setters for these
        this.guests = guests;
    }

    public void printTrackInfo() {
        System.out.printf("%s.%s - %f %n", title, fileExtension, length);
        System.out.println("Guests:"); 
        for (int i = 0; i < guests.length; i++) {
            System.out.println(guests[i]);
        }
    }
}
