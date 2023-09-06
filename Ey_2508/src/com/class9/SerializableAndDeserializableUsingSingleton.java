package com.class9;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInput;

import java.io.ObjectInputStream;

import java.io.ObjectOutput;

import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {

		private static final SerializedSingleton instance = new SerializedSingleton();

	}

	public static SerializedSingleton getInstance() {

		return SingletonHelper.instance;

	}

	protected Object readResolve() {

		return getInstance();

	}

}

public class SerializableAndDeserializableUsingSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// TODO Auto-generated method stub

		SerializedSingleton instance1 = SerializedSingleton.getInstance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:/Files/ABC.txt"));

		out.writeObject(instance1);

		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("C:/Files/ABC.txt"));

		SerializedSingleton instance2 = (SerializedSingleton) in.readObject();

		in.close();

		System.out.println("Instance1 - HashCode Value " + instance1.hashCode());

		System.out.println("Instance2 - HashCode Value " + instance2.hashCode());

	}

}