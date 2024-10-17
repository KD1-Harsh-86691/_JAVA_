package com.sunbeam.p1;

import com.sunbeam.p1.Invoice;

public class Test {

	public static void main(String[] args) {
		double totalBill;
		Invoice i1 = new Invoice();
//		i1.accept(); // Default output from parameterless ctor

		Invoice i2 = new Invoice();

		i2.accept();
		i2.display();
        totalBill = i2.totalPrice();
        System.out.println("Total Price is : "+ totalBill);
	}

}
