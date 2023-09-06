package com.class11;

interface Shape {
	public void draw();
}

class Rectange implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle class draw function");

	}

}

class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Sqaure class draw function");

	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle class draw function");
	}

}

class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectange();
		}
		if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
	}

}
