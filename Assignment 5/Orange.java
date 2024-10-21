// KD1-86691-HARSH

package com.app.fruits;

public class Orange extends Fruits {
	
	public Orange() {
	}

	public Orange(String color, double weight, String name) {
		super(color, weight, name, true);
	}

	@Override
	public String taste() {

		return "Sour";
	}

}
