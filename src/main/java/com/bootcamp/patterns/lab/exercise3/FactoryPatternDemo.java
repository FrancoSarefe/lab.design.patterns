package com.bootcamp.patterns.lab.exercise3;

import com.bootcamp.patterns.lab.exercise3.enums.ShapeType;
import com.bootcamp.patterns.lab.exercise3.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = ShapeFactory.newInstance();

		Shape circle = shapeFactory.drawShape(ShapeType.CIRCLE);
		circle.draw();

		Shape square = shapeFactory.drawShape(ShapeType.SQUARE);
		square.draw();

		Shape rectangle = shapeFactory.drawShape(ShapeType.RECTANGLE);
		rectangle.draw();
	}

}
