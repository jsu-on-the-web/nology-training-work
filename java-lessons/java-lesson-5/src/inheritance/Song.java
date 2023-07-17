package inheritance;

public class Song extends Track {
    String artist;


    public Song(String title, float length, String fileExtension, String artist) {
        super(title, length, fileExtension);
        // TODO: Make setters for these
        this.artist = artist;
    }

    public void printTrackInfo() {
        System.out.printf("%s.%s - %f %n", title, fileExtension, length);
        System.out.println("Artist: " + artist);
    }
}
