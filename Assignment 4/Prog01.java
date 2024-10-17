// HARSH DIXIT - KD1 - 86691

package com.app.geometry;

// to use pow,sqrt we have to import java.lang.Math
import java.lang.Math;

class Point2D{
	int xaxis;
	int yaxis;
	
	
	public Point2D(int xaxis, int yaxis) {
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}
	
	public String getDetails() {
		return "(" + xaxis + ", " + yaxis + ")";
	}
	
	public boolean isEqual(Point2D p2) {
		if(this.xaxis == p2.xaxis && this.yaxis == p2.yaxis) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calculateDistance(Point2D p2) {
		double distance = Math.sqrt((Math.pow(this.xaxis - p2.xaxis , 2) + Math.pow(this.yaxis - p2.yaxis , 2)));
		return distance;
		
	}
	
	public void accept() {
		System.out.println("Enter coordinates for point p1");
		
		System.out.println("Enter coordinates for point p2");
	}
}

