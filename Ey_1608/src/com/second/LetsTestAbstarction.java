package com.second;

abstract class Shape{
	abstract void draw();
	int length,area,breadth,height,radius;
	double areaOfCircle;
	
	void purpose() {
		System.out.println("Calculate the area of different shape");
	}
}

class Triangle extends Shape{
	void draw() {
		int breath=20;height=30;
		area =(breath*height)/2;
		System.out.println("Area of Triangle is"+ area);

}
}
class Rectangle extends Shape{
	void draw() {
		int breath=20;height=30;
		area =(breath*height);
		purpose();
		System.out.println("Area of Reactangle is"+ area);
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		int radius=10;
		areaOfCircle=Math.PI*radius*radius;
		purpose();
		System.out.println("Area of Circla is"+ areaOfCircle);
	}
	
}
public class LetsTestAbstarction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr=new Triangle();
		tr.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		Circle circ= new Circle();
		circ.draw();
	}
	

}
