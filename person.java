import java.util.Scanner;
import java.util.Random;
public class person {
    //creating all the necessary variables
    String name;
    int str;
    int spe;
    int def;
    int hp;
    static String tempName;
    static int tempStr;
    static int tempSpe;
    static int tempDef;
    static int randNum;
    //constructer
    public person(String personName, int strength, int speed, int defense, int health){
        name = personName;
        str = strength;
        spe = speed;
        def = defense;
        hp = health;
    }
    public static void createPlayer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Player name?");
        tempName = input.nextLine();
        System.out.println("Player strength? (total of all stats must be 100 or less)");
        tempStr = input.nextInt();
        System.out.println("Player speed? (total of all stats must be 100 or less)");
        tempSpe = input.nextInt();
        System.out.println("Player defense? (total of all stats must be 100 or less)");
        tempDef = input.nextInt();
        input.close();
        if (tempStr + tempSpe + tempDef > 100) {
            System.out.println("Stats too large! try again");
            System.exit(0);
        }
    }
    public static void createEnemy(){
        Random rand = new Random();
        randNum = rand.nextInt(2);
        if (randNum == 0) {
            tempName = "Bruiser type";
            tempStr = 30;
            tempSpe = 15;
            tempDef = 15;
        } else {
            if (randNum == 1) {
                tempName = "Speedster type";
                tempStr = 15;
                tempSpe = 30;
                tempDef = 15;
            } else {
                if (randNum == 2) {
                    tempName = "Tank type";
                    tempStr = 20;
                    tempSpe = 10;
                    tempDef = 30;
                } else {
                    System.out.println("error!");
                    System.exit(0);
                }
            }
        }
    }
    public String toString(){
        return name + "," + str + "," + spe + "," + def;
    }
}
