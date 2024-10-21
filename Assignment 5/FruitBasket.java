// KD1-86691-HARSH

package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter basket size: ");
		int size = scanner.nextInt();

		Fruits[] basket = new Fruits[size];
		int counter = 0;

		while (true) {
			System.out.println("Choice: 0-Exit\n 1-Add Mango\n 2-Add Orange\n 3-Add Apple\n "
					+ "4-Display All\n 5-Display name,color,weight,taste of all fresh fruits in the basket\n"
					+ " 6-Display taste of all the stale\n 7-Mark a fruit as stale\n 8-Mark all sour fruits stale ");
			int Choice = scanner.nextInt();
			switch (Choice) {
			case 1:
				if (counter < size) {
					basket[counter] = new Mango();
					basket[counter].accept(scanner);
					counter++;
				}
				break;
			case 2:
				if (counter < size) {
					basket[counter] = new Orange();
					basket[counter].accept(scanner);
					counter++;
				}
				break;
			case 3:
				if (counter < size) {
					basket[counter] = new Apple();
					basket[counter].accept(scanner);
					counter++;
				}
				break;
			case 4:
				// USING FOR LOOP
				for (int i = 0; i < counter; i++) {
					if (basket[i] != null) {
						System.out.println(basket[i].getName());
					}

					// USING FOR EACH LOOP
//					for(Fruits fruit : basket) {
//						if(fruit != null) {
//							System.out.println(fruit.getName());
//						}
				}
				break;

			case 5:
				for (int i = 0; i < counter; i++) {
					if (basket[i] != null) {
						System.out.println(basket[i].toString());
					}
				}
				break;
				
			case 6:
				System.out.println("Taste of all stale fruits");
				
				for(Fruits fruit : basket) {
					if(fruit != null && !fruit.isFresh()) {
						System.out.println(fruit.getName() +","+fruit.taste());
					}
				}
				break;

// To implement case 6 we have to first implement case 7
			case 7:
				System.out.println("Enter index number to mark fruit as stale");
				int index = scanner.nextInt();

				if (index >= 0 && index < counter && basket[index] != null) {
					basket[index].setFresh(false);
					System.out.println("Marked fruit as stale..");
				}
				break;
				
			case 8:
				for(Fruits fruit : basket) {
					if(fruit !=null && fruit.taste().equals("sour")) {
						fruit.setFresh(false);
					}
				}
				break;

			default:
				System.out.println("Invalid option");
			}
		}
	}
}
