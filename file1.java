import java.util.Random;
public class file1 {
    public static void main(String[] args) {
        person.createPlayer();
        person Player = new person(person.tempName, person.tempStr, person.tempSpe, person.tempDef, 100);
        System.out.println(Player);
        person.createEnemy();
        person Enemy1 = new person(person.tempName, person.tempStr, person.tempSpe, person.tempDef, 50);
        person.createEnemy();
        person Enemy2 = new person(person.tempName, person.tempStr, person.tempSpe, person.tempDef, 50);
        System.out.println("You will be fighting...");
        System.out.println(Enemy1.name);
        System.out.println(Enemy2.name);
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
