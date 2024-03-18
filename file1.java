import java.util.Random;
public class file1 {
    public static void main(String[] args) {
        Player.createPlayer();
        Player Player1 = new Player(Player.tempName, Player.tempStr, Player.tempSpe, Player.tempDef, 100);
        System.out.println(Player1);
        Enemy.createEnemy();
        Enemy Enemy1 = new Enemy(Enemy.tempName, Enemy.tempStr, Enemy.tempSpe, Enemy.tempDef, 50);
        Enemy.createEnemy();
        Enemy Enemy2 = new Enemy(Enemy.tempName, Enemy.tempStr, Enemy.tempSpe, Enemy.tempDef, 50);
        System.out.println("You will be fighting...");
        System.out.println(Enemy1);
        System.out.println(Enemy2);
        System.out.println("BEGIN");
        System.out.println("Unfortunately, this is the end of the demo, let's just say");
        Random randNum = new Random();
        int winningNum = randNum.nextInt(1);
        if (winningNum == 0) {
            System.out.println("You triumph over " + Enemy1.name + " and " + Enemy2.name + "! Congrats!");
        } else {
            if (winningNum == 1) {
                System.out.println(Enemy1.name + " " + Enemy2.name + " win! Better luck next time!");
            }
        }
    }
}