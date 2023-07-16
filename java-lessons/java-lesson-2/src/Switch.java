import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println(
                    "Do you want to keep running this program? \n Type 'c' for continue, \n 'e' for exit, \n 'x' for exit, \n 'E' for exit, \n 'Q' for exit, \n 'X' for exit");

            char command = scan.next().charAt(0); // Grab the first character of the input

            switch (command) {
                case 'c':
                    System.out.println("Continue running");
                    break;
                case 'e':
                case 'q':
                case 'x':
                case 'E':
                case 'Q':
                case 'X':
                    System.out.println("Exit");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

        scan.close();
    }
}
