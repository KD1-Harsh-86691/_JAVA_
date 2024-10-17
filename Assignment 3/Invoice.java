package com.sunbeam.p1;

import java.util.Scanner;

class Invoice {
	String partNo;
	String partDesc;
	int partQuant;
	double pricePerItem;

	public Invoice() {
		partNo = "";
		partDesc = "";
		partQuant = 0;
		pricePerItem = 0.0;
	}

	public Invoice(String partNo, String partDesc, int partQuant, double pricePerItem) {
		super();
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.partQuant = partQuant;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getPartQuant() {
		return partQuant;
	}

	public void setPartQuant(int partQuant) {
		this.partQuant = partQuant;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Part Number - ");
		partNo = sc.next();

		System.out.println("Enter Part Description - ");
		partDesc = sc.next();

		System.out.println("Enter Part Quantity - ");
		partQuant = sc.nextInt();
		if (partQuant < 0) {
			setPartQuant(0);
		} else {
			setPartQuant(partQuant);
		}

		System.out.println("Enter Price per Item - ");
		pricePerItem = sc.nextDouble();
		if (pricePerItem < 0) {
			setPricePerItem(0.0);
		} else {
			setPricePerItem(pricePerItem);
		}

	}

	public void display() {
		System.out.println("Part Number - " + partNo);
		System.out.println("Part Description - " + partDesc);
		System.out.println("Part Quantity - " + partQuant);
		System.out.println("Price per item - " + pricePerItem);
	}

	public double totalPrice() {
		double amount;
		amount = getPricePerItem() * getPartQuant();
		return amount;
	}
}
