import java.util.Scanner;

public class Ques01 {

	public static void main(String[] args) {
		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();

		// Display the results
		System.out.println("Given Number: " + number);
		System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
		System.out.println("Octal equivalent: " + Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number).toUpperCase());
	}
}
