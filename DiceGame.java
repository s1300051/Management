import java.util.Random;

public class DiceGame
{
    public static void main(String[] args)
    {
	int die1 = getDice(), die2 = getDice();

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + die1);
	System.out.println("Die 2: " + die2);
	System.out.println("Total value: " + getValue(die1, die2));
    }

    public static int getDice()
    {
	Random rand = new Random();
	return rand.nextInt(6) + 1;
    }

    public static int getValue(int x, int y) {return x + y;}
}
