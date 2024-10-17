package com.sunbeam.p2;

import com.sunbeam.p2.EmployeeTest;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println("--------------------------------------------");

		e1.accept();
		e1.display();

		e2.accept();
		e2.display();
		System.out.println("--------------------------------------------");

		System.out.println("Yearly Salary of Employee e1 is " + e1.getYearlySalary());
		System.out.println("Yearly Salary of Employee e2 is " + e2.getYearlySalary());

		System.out.println("--------------------------------------------");
		
		System.out.println("Yearly Salary of Employee e1 after 10% raise = " + e1.getRaiseInSalary());
		
		System.out.println("Yearly Salary of Employee e2 after 10% raise = " + e2.getRaiseInSalary());
		
		System.out.println("--------------------------------------------");
	}

}
