// KD1-86691-HARSH

package com.app.fruits;

public class Mango extends Fruits {
	
	public Mango() {
	}

	public Mango(String color, double weight, String name) {
		super(color, weight, name, true);
	}

	@Override
	public String taste() {

		return "Sweet";
	}

}
