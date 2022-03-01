
package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Bilbo", 10, 2.5);
        Enemy slime = new Enemy("Slime", 5, 2.5);
        Systems system = new Systems(player, slime);
        UserInterface ui = new UserInterface(scanner, player, slime, system);

        ui.start();
    }
}
