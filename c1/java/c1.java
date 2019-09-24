import java.util.Scanner;

class main
{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);

	System.out.println("Enter your grade for programming (0-100):");
	String grade = s.nextLine();
	int intGrade = Integer.parseInt(grade);
	if(intGrade == 100){
	    System.out.println("Congratulations! You got a perfect score!");
	}
	if(intGrade >= 90 && intGrade <= 100){
	    System.out.println("You got an A");
	} else if(intGrade >= 80 && intGrade < 90){
	    System.out.println("You got a B");
	} else if(intGrade >= 70 && intGrade < 80){
	    System.out.println("You got a C");
	} else if(intGrade >= 60 && intGrade < 70){
	    System.out.println("You got a D");
	} else {
	    System.out.println("You got an F");
	}

    }
}
