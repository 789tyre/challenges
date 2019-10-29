import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
	Scanner s = new Scanner(System.in);
	int[] pancakes = new int[10];
	int[] people = new int[10];
	boolean hasSwapped = true;

	for (int i = 0; i < pancakes.length; i++){
	    pancakes[i] = -1;
	    people[i] = i + 1;
	    while (pancakes[i] == -1)
	    {
		try
		{
		    System.out.println("How many pancakes did Person " + people[i] + " eat?"); 
		    pancakes[i] = s.nextInt();
		    if(pancakes[i] < 0)
		    {
			throw new java.util.InputMismatchException();
		    }
		} catch (java.util.InputMismatchException e) {
		    System.out.println("That's illegal.");
		    s.next();
		}
	    }
	}
	//Let's sort out some pancakes! (bubble sort)
	while (hasSwapped)
	{
	    hasSwapped = false;
	    for (int i = 1; i < 10; i++)
	    {
		if(pancakes[i-1] < pancakes[i])
		{
		    int tempPancakes = pancakes[i-1];
		    int tempPerson = people[i-1];

		    pancakes[i-1] = pancakes[i];
		    pancakes[i] = tempPancakes;

		    people[i-1] = people[i];
		    people[i] = tempPerson;
		    hasSwapped = true;
		}
	    }
	}
	
	//Printing time!
	for (int i = 0; i < 10; i++)
	{
	    if(pancakes[i] == 1)
	    {
		System.out.println("Person " + people[i] + ": " + pancakes[i] + " pancake");   
	    } else {
		System.out.println("Person " + people[i] + ": " + pancakes[i] + " pancakes");   
	    }
	}
	System.out.println("Person " + people[0] + " ate the most pancakes");
	System.out.println("Person " + people[9] + " ate the least pancakes");
    }
}
