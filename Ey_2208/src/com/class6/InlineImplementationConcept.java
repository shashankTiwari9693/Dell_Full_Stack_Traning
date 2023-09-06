package com.class6;

@FunctionalInterface
interface Sample {
	String print(String name);
}

public interface InlineImplementationConcept {

	public static void main(String[] args) {
		Sample obj = (name) -> {
			return "Welcome" + name;
		};
		System.out.println(obj.print("to lambda Expression Programming"));

	}
}
