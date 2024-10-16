// Harsh Dixit
// KD1-86691-HARSH

import java.util.Scanner;

public class Ques01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int number = scanner.nextInt();

		System.out.println("Given Number: " + number);
		System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
		System.out.println("Octal equivalent: " + Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number).toUpperCase());
	}
}
