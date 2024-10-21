// KD1-86691-HARSH

package com.app.fruits;

import java.util.Scanner;


// We have to declare our class abstract because this class consists of abstract method
public abstract class Fruits {
	String color;
	double weight;
	String name;
	boolean isFresh;

	//PARAMETERLESS CONSTRUCTOR
	
	public Fruits() {
	}

	//PARAMETERIZED CONSTRUCTOR
	
	public Fruits(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	// GETTER & SETTERS

    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public boolean isFresh() {
        return isFresh;
    }
	
	public void accept (Scanner sc) {
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter color");
		color = sc.next();
		System.out.println("Enter weight");
		weight = sc.nextDouble();
	}
	
	
	// Override this method from object class
	@Override
	public String toString() {
		return "name = " + name + " color = " + color + " weight = " + weight;
	}

	//ABSTRACT METHOD
	
	public abstract String taste();

}
