
package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Bilbo", 5, 2.5);
        Enemy slime = new Enemy("Slime", 10, 2.5);

        showMenu(player, slime);

    }

    public static void showMenu(Player player, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);

        while  (true) {
            if (enemy.getHealth() > 0) {
                System.out.println();
                System.out.println(player + " ==== " + enemy);
                System.out.println();

                System.out.println("Options.\n" +
                        "1. Attack\n" +
                        "2. Defend (Not implemented)\n" +
                        "3. Run\n");
                System.out.println("What do you want to do?");
                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        attackEnemy(player, enemy);
                        battleInfo(player, enemy);
                        battleAI(player, enemy);
                        break;
                    case 0:
                        break;
                }
            }

            if (enemy.getHealth() <= 0) {
                System.out.println("Enemy is defeated!");
                break;
            }

            if (player.getHealth() <= 0) {
                System.out.println("Game Over!");
                break;
            }
        }
    }

    public static void attackEnemy(Player player, Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - player.getAttack());
    }

    public static void battleInfo(Player player, Enemy enemy) {
        System.out.println("You attacked! " + enemy.getName() + " suffered " + player.getAttack() + " damage.");
        System.out.println(enemy.getName() + " dealt " + enemy.getAttack() + " damage to " + player.getName() + ".");
    }

    public static void battleAI(Player player, Enemy enemy) {
        player.setHealth(player.getHealth() - enemy.getAttack());
    }
}
