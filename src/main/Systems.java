package main;

public class Systems {

    private Player player;
    private Enemy enemy;

    public Systems(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void attackEnemy() {
        enemy.setHealth(enemy.getHealth() - player.getAttack());
    }

    public void battleInfo() {
        System.out.printf("You attacked! %s suffered %.1f damage.\n", enemy.getName(), player.getAttack());
        System.out.printf("%s dealt %.1f damage to %s.\n", enemy.getName(), enemy.getAttack(), player.getName());
    }

    public void battleAI() {
        player.setHealth(player.getHealth() - enemy.getAttack());
    }

}
