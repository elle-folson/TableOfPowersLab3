import java.util.Scanner;

/* Display a table of powers
 * Prompt the user to enter an integer
 * Displays a table of squares and cubes from 1 to the value entered
 * Prompts the user to continue
 */
public class tableOfPowersLab3 {

	public static void main(String[] args) {
		
		int num1;
		int square;
		int cube;
		String row = "";
		
		Scanner input = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Learn your squares and cubes!");
		
		while(choice.equalsIgnoreCase("y"))
		{
			
		//user input integer prompt
		System.out.print("Enter an integer: ");
		num1 = input.nextInt();
		System.out.println();
		
		//squares and cubes table display
		System.out.println("Number" + "  " + "Squared" + " " + "Cubed");
		System.out.println("======" + "  " + "=======" + " " + "=====");
		
		for (int i=1; i <= num1; i++)
		{
			square = i * i;
			cube = i * i * i;
			
			row = i + "      " + square + "      " + cube;
			System.out.println(row);
		}		
		System.out.println();
		
		// see if the user wants to continue
		System.out.print("Continue?? (y/n):");
		choice = input.next();
		System.out.println();
		
}
}
}
