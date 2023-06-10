import java.util.Scanner;
import java.util.Random;

public class GreetingAndDiceGame
{
    public static void main(String[] args)
    {
	System.out.println("What is your name?");
	System.out.print("> ");
	String name = setText();
	System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
	int die1 = getDice(), die2 = getDice();
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + getValue(die1, die2));
    }

    public static String setText()
    {
	Scanner s = new	Scanner(System.in);
	String text = s.nextLine();
	return text;
    }

    public static int getDice()
    {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static int getValue(int x, int y) {return x + y;}
}
