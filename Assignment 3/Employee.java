package com.sunbeam.p2;

import java.util.Scanner;

public class Employee {

	String firstName;
	String lastName;
	double monthlySalary;

	public Employee() {

	}

	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getmonthlySalary() {
		return monthlySalary;
	}

	public void setmonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee First Name: ");
		firstName = sc.next();
		System.out.println("Enter Employee Last Name: ");
		lastName = sc.next();
		System.out.println("Enter Employee monthlySalary: ");
		monthlySalary = sc.nextDouble();
		System.out.println("--------------------------------------------");
	}

	public void display() {
		System.out.println("Employee First Name: " + firstName);
		System.out.println("Employee Last Name: " + lastName);
		System.out.println("Employee Monthly Salary: " + monthlySalary);
	}

	double yearlySalary;

	public double getYearlySalary() {
		yearlySalary = monthlySalary * 12;
		return yearlySalary;
	}

	double raisedSalary;

	public double getRaiseInSalary() {
		raisedSalary = yearlySalary + yearlySalary * 0.1;
		return raisedSalary;
	}
}
