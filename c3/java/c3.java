//while(user == gullible)

import java.util.Scanner;

class main
{ 
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);

	int number = 0;
	int counter = -1;
	while(number != counter && counter < 10){
	   counter++;
	   try{
	       System.out.println("Enter a number that is not " + counter + ":");
	       number = s.nextInt();
	   } catch (java.util.InputMismatchException e){
	       s.next();
	   }
	}
	
	if (number == counter){
	    System.out.println("Hey, You weren't supposed to do that!");
	    System.exit(0);
	}

	if (counter >= 10){
	    System.out.println("You have more patience than I have. You win.");
	}
    }
}
