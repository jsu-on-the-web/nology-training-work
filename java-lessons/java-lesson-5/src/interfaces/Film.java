package interfaces;

import java.util.Arrays;

public class Film implements IMedia {
    String title;
    short yearReleased;
    String[] cast;
    String genre;
    String[] characters;

    public Film(String title, short yearReleased, String[] cast, String genre, String[] characters) {
        this.title = title;
        this.yearReleased = yearReleased;
        this.cast = cast;
        this.genre = genre;
        this.characters = characters;
    }

    @Override
    public String getInfo() {
        return "Title: " + title + "\nYear Released: " + yearReleased + "\nCast: " + Arrays.toString(cast) + "\nGenre: " + genre;
    }

    @Override
    public String getCharacters() {
        String output = "The characters in this film are: \n";
        for (String character : characters) {
            output += character + "\n";
        }
        return output;
    }
}
