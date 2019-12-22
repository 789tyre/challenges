import java.util.Scanner;
import java.util.Random;
class main
{
    public static void guessGame()
    {
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	int cnum = r.nextInt(100) + 1;
	int hnum = 0;
	int guesses = 0;

	while (hnum != cnum)
	{
	    guesses++;

	    try {
		System.out.print("Guess my number: ");
		hnum = s.nextInt();
		if (hnum > cnum)
		{
		    System.out.println("Too high");
		} else if (hnum < cnum) {
		    System.out.println("Too low");
		} else if (hnum == cnum) {
		    System.out.println("That's right!");
		}
	    } catch (java.util.InputMismatchException e) {
		System.out.println("That's illegal.");
		s.next();
		hnum = 0;
	    }
	}
	System.out.println("You guessed " + cnum + " in " + guesses + " guesses! ");
	s.close();
    }

    public static void reverseGuessGame()
    {
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	int cnum = r.nextInt(100) + 1;
	int upperLimit = 101;
	int lowerLimit = 0;
	int hnum = 0;
	
	while (hnum != 3)
	{
	    try {
		System.out.println("Is your number " + cnum + "?");
		System.out.println("1. Too low");
		System.out.println("2. Too high");
		System.out.println("3. Correct");

		hnum = s.nextInt();
		if (hnum < 1 || hnum > 3)
		{
		    throw new java.util.InputMismatchException();
		}

		switch (hnum)
		{
		    case 1: 
			lowerLimit = cnum;
			break;
		    case 2:
			upperLimit = cnum;
			break;
		    case 3:
		    default:
			break;
		}
		cnum = ((upperLimit - lowerLimit) / 2) + lowerLimit;

	    } catch (java.util.InputMismatchException e) {
		System.out.println("That's not an option.");
		s.next();
		hnum = 0;
	    }
	}
	s.close();
	System.out.println("Yay! I got it right!");
    }

    public static void main(String[] args)
    {
	Scanner s = new Scanner(System.in);
	int choice = 0;
	while (choice == 0)
	{
	    try
	    {
		System.out.println("What do you want to do?");
		System.out.println("1. Guess a number between 1 and 100");
		System.out.println("2. Make the computer guess a number between 1 and 100");
		choice = s.nextInt();

		switch (choice)
		{
		    case 1:
			guessGame();
			break;
		    case 2:
			reverseGuessGame();
			break;
		    default:
			throw new java.util.InputMismatchException();
		}

	    } catch (java.util.InputMismatchException e) {
		System.out.println("That's illegal.");
		s.next();
		choice = 0;
	    }
	}
    }
}
