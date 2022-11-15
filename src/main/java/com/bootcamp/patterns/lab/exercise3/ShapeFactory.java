package com.bootcamp.patterns.lab.exercise3;

import com.bootcamp.patterns.lab.exercise3.enums.ShapeType;
import com.bootcamp.patterns.lab.exercise3.interfaces.Shape;
import com.bootcamp.patterns.lab.exercise3.shapes.Circle;
import com.bootcamp.patterns.lab.exercise3.shapes.Rectangle;
import com.bootcamp.patterns.lab.exercise3.shapes.Square;

public class ShapeFactory {

	private static ShapeFactory INSTANCE;

	public static ShapeFactory newInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ShapeFactory();
		}
		return INSTANCE;
	}

	private ShapeFactory() {
	}

	public Shape drawShape(ShapeType type) {

		Shape shape = null;

		switch (type) {
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}
		return shape;
	}
}
