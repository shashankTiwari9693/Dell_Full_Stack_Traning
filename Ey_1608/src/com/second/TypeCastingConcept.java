package com.second;

import javax.crypto.Mac;

class Machine {
	void start() {
		System.out.println("Machine has Started!");
	}

	void stop() {
		System.out.println("Machine has Stopped!");
	}
}

class Camera extends Machine {
	@Override
	void start() {
		System.out.println("Camera has Started!");
	}

	void snap() {
		System.out.println("Photo clicked!");
	}
}

public class TypeCastingConcept {
public static void main(String[] args) {
	Machine m = new Machine();
	Camera c = new Camera();
	
	m.start(); //Machine has Started!
	m.stop();  //Machine has Stopped!

	c.start(); //Camera has Started!
	c.snap(); //Photo clicked!
	c.stop(); //Machine has Stopped!
	
	Machine M1 = new Camera();
	M1.start(); //Camera has Started!
	M1.stop();  //Machine has Stopped!
			
	//Upcasting
	Machine m2 =c;
	m2.start();
	m2.stop();
	
	//Downcasting --correct
	Machine m3=new Camera();
	Camera c2=(Camera)m3;//Downcasting
	c2.start();
	c2.snap();
	c2.stop();
}
}
