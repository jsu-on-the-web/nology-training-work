package interfaces;

public class Novel implements IMedia {
    String title;
    String author;
    String[] characters;
    String genre;
    int pageCount;

    public Novel(String title, String author, String[] characters, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.characters = characters;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    @Override
    public String getInfo() {
        return "Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre
                + "\nPage Count: " + pageCount;
    }

    @Override
    public String getCharacters() {
        String output = "The characters in this novel are: \n";
        for (String character : characters) {
            output += character + "\n";
        }
        return output;
    }
}
