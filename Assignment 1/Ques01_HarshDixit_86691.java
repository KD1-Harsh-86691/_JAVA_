import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextDouble()&& !sc.hasNextInt()) {
			double d1= sc.nextDouble();
			System.out.println("Enter Second Number: ");
			if(sc.hasNextDouble()&& !sc.hasNextInt())
			{
			double d2 = sc.nextDouble();
			double avg = (d1 + d2)/2;
			System.out.println("Avg = "+ avg);
		    }
			else {
				System.out.println("Second number is not a double type..");
			}
		} else {
			System.out.println("First number is not a double type..");
		}

	}

}
