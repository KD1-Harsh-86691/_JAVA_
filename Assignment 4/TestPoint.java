// HARSH DIXIT - KD1 - 86691

package tester;

import java.util.Scanner;

class Point {
	// Fields of class Point
	int xaxis;
	int yaxis;

	// Parameterized Constructor
	public Point(int xaxis, int yaxis) {
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}

	// Methods
	public String getDetails() {
		return "(" + xaxis + ", " + yaxis + ")";
	}

	public boolean isEqual(Point p2) {
		if (this.xaxis == p2.xaxis && this.yaxis == p2.yaxis) {
			return true;
		} else {
			return false;
		}
	}

	public double calculateDistance(Point p2) {
		double distance = Math.sqrt((Math.pow(this.xaxis - p2.xaxis, 2) + Math.pow(this.yaxis - p2.yaxis, 2)));
		return distance;

	}
}

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates for point 1 - ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		Point p1 = new Point(x1, y1);

		System.out.println("Enter the coordinates for point 2 - ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		Point p2 = new Point(x2, y2);

		System.out.println("Coordinates of Point 1 = " + p1.getDetails());
		System.out.println("Coordinates of Point 2 = " + p2.getDetails());

		if (p1.isEqual(p2)) {
			System.out.println("p1 & p2 are located at the same position...");
		} else {
			System.out.println("Both coordinates of p1 and p2 are different...");
			System.out.println("Distance between p1 and p2 coordinates = " + p1.calculateDistance(p2));
		}

	}

}
