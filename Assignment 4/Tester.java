// HARSH DIXIT - KD1 - 86691

package com.app.geometry;

import com.app.geometry.Point2D;

public class Tester 
{

	public static void main(String[] args) {
		Point2D p1 = new Point2D(1,5);
		System.out.println("Coordinates of Point 1: " + p1.getDetails());
		
		Point2D p2 = new Point2D(5,8);
		System.out.println("Coordinates of Point 2: " + p2.getDetails());
		
		
	// checking if 
	if(p1.isEqual(p2))
	{
		System.out.println("p1 & p2 are located at the same position...");
	}
	else
	{
        System.out.println("Both points are located at different positions.");
        System.out.println("Distance bewteen p1 and p2 = " + p1.calculateDistance(p2));
    }
	
	}
}