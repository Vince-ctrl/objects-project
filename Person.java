import java.util.Scanner;
import java.util.Random;
public class Person {
    //creating all the necessary variables
    //constructer
    public Person(){
    }
    public String toString(){
        return "f";
    }
}
//making an enemy class
class Enemy extends Person {
    //all the needed variables
    String name;
    int str;
    int spe;
    int def;
    int hp;
    static String tempName;
    static int tempStr;
    static int tempSpe;
    static int tempDef;
    //constructor
    Enemy(String name, int str, int spe, int def, int hp){
        super();
        this.name = name;
        this.str = str;
        this.spe = spe;
        this.def = def;
        this.hp = hp;
    }
    public static void createEnemy(){
        //make a random number, 0, 1, or 2
        Random rand = new Random();
        int randNum = rand.nextInt(2);
        //use that random number to decide the type of enemy
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
                    System.exit(1);
                }
            }
        }
    }
    public String toString(){
        return name + ", " + str + ", " + spe + ", " + def;
    }
}
class Player extends Person {
    String name;
    int str;
    int spe;
    int def;
    int hp;
    static String tempName;
    static int tempStr;
    static int tempSpe;
    static int tempDef;
    Player(String name, int str, int spe, int def, int hp){
        super();
        this.name = name;
        this.str = str;
        this.spe = spe;
        this.def = def;
        this.hp = hp;
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
    public String toString(){
        return name + ", " + str + ", " + spe + ", " + def;
    }
}