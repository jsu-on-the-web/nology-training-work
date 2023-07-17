package interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());

        // Polymorphism - You can treat Cat and Dog as MakesASound
        AnimalUtils.printAnimalInfo(cat);
        AnimalUtils.printAnimalInfo(dog);

        Novel novel = new Novel("Harry Potter", "J.K. Rowling",
                new String[] { "Harry Potter", "Hermione Granger", "Ron Weasley" }, "Fantasy", 300);
        // System.out.println(novel.getInfo());
        // System.out.println(novel.getCharacters());

        Film film = new Film("Harry Potter", (short) 2005,
                new String[] { "Daniel Radcliffe", "Emma Watson", "Rupert Grint" }, "Fantasy",
                new String[] { "Harry Potter", "Hermione Granger", "Ron Weasley" });
        // System.out.println(film.getInfo());
        // System.out.println(film.getCharacters());

        IMedia[] media = { film, novel };
        for (IMedia iMedia : media) {
            System.out.println(iMedia.getInfo() + "\n" + iMedia.getCharacters());
        }
    }
}
