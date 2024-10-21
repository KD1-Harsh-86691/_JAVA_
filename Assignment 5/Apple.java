// KD1-86691-HARSH

package com.app.fruits;

public class Apple extends Fruits {

	public Apple() {
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name, true);
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}
}
