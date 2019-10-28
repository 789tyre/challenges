import java.util.Scanner;
class main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int[] pancakes = new int[10];
	for (int i = 0; i < pancakes.length; i++){
	    try{
		pancakes[i] = 0; //get input here
	    } catch {
		System.out.println("That's illegal.");
	    }
	}
    }
}
