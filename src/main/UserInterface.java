package main;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Player player;
    private Enemy enemy;
    private Systems system;

    public UserInterface(Scanner scanner, Player player, Enemy enemy, Systems system) {
        this.scanner = scanner;
        this.player = player;
        this.enemy = enemy;
        this.system = system;
    }

    public void start() {
        while (true) {
            if (enemy.getHealth() > 0) {
                System.out.println();
                System.out.println(player + " ==== " + enemy);
                System.out.println();

                System.out.println("Options.\n" +
                        "1. Attack\n" +
                        "2. Defend (Not implemented)\n" +
                        "3. Run\n");
                System.out.print("What do you want to do?");
                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        this.system.attackEnemy();
                        this.system.battleInfo();
                        this.system.battleAI();
                        break;
                    case 3:
                        break;
                }
            }

            // Either of these outcomes will exit the loop
            if (enemy.getHealth() <= 0) {
                System.out.println("Enemy is defeated!");
                break;
            } else if (player.getHealth() <= 0) {
                System.out.println("You died. Game Over!");
                break;
            } else {
                System.out.println("You ran away!");
                break;
            }
        }
    }


}
