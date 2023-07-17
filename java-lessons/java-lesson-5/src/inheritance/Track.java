package inheritance;

public class Track {
    // ? What stuff do podcasts and songs have in common?
    String title;
    float length;
    String fileExtension;

    public Track(String title, float length, String fileExtension) {
        this.title = title;
        this.length = length;
        this.fileExtension = fileExtension;
        // TODO: Make setters for these
    }

    /**
     * ============================================
     ** GETTERS AND SETTERS
     * =============================================
     **/

    public void printTrackInfo() {
        System.out.printf("%s.%s - %f %n", title, fileExtension, length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null");
        } 
        this.title = title;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length; 
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        if (fileExtension.isEmpty()) {
            throw new IllegalArgumentException("File extension cannot be null");
        } else if (!fileExtension.endsWith("mp3") && !fileExtension.endsWith("wav") && !fileExtension.endsWith("flac")) {
            throw new IllegalArgumentException("File extension must be .mp3, .wav, or .flac");
        }
        this.fileExtension = fileExtension;
    }
}
