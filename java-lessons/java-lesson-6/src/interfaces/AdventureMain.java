import java.util.Scanner;

public class AdventureMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name, adventurer: ");
        String name = scanner.nextLine();
        Player player = new Player(name);

        System.out.println("Welcome, " + player.getName() + "!");

        // Battle
        
    }
}
