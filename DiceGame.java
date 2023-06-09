import java.util.Random;

public class DiceGame
{
    public static void main(String[] args)
    {
	DiceGame d = new DiceGame();
	int die1 = d.getDice(), die2 = d.getDice();

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + die1);
	System.out.println("Die 2: " + die2);
	System.out.println("Total value: " + d.getValue(die1, die2));
    }

    public int getDice()
    {
	Random rand = new Random();
	return rand.nextInt(6) + 1;
    }

    public int getValue(int x, int y) {return x + y;}
}
