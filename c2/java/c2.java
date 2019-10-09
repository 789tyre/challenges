import java.util.Scanner;

class main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int choice = 0;
	System.out.println("\nWhat would you like to drink?");
	System.out.println("1. Water\n2. Coca Cola\n3. Pepsi\n4. Pepno\n5. 7Up\n");
	try{
	    choice = s.nextInt();
	}
	catch (java.util.InputMismatchException e){
	    System.out.println("You get Pepno now because you suck.");
	    choice = 4;
	    System.exit(0);
	}
	// switch(choice){
	//     case 1:
	// 	System.out.println("You chose water.");
	// 	break;
	//     case 2:
	// 	System.out.println("You got Coca Cola.");
	// 	break;
	//     case 3:
	// 	System.out.println("Si, I will deliver");
	// 	break;
	//     case 4:
	// 	System.out.println("Pepno, really? Sure");
	// 	break;
	//     case 5:
	// 	System.out.println("7Up coming down");
	// 	break;
	//     default:
	// 	System.out.println("Error. choice was not valid, here is your money back.");
	// 	break;
	// }
    
	// This is to complete the star challenge
	if(choice == 1){
	    System.out.println("You chose water.");
	} else if (choice == 2) {
	    System.out.println("You got Coca Cola.");
	} else if (choice == 3) {
	    System.out.println("Si, I will deliver");
	} else if (choice == 4) {
	    System.out.println("Pepno, really? Sure");
	} else if (choice == 5) {
	    System.out.println("7Up coming down");
	} else {
	    System.out.println("Error. choice was not valid, here is you money back.");
	}
    }
}
