package com.class6;

@FunctionalInterface
interface MyComparable {
	boolean compare(int a1, int a2);
}

public class AnotherLambdaExpressionExample {
	public static void main(String[] args) {
		MyComparable obj = (n1, n2) -> {
			return n1 > n2;
		};
		boolean result = obj.compare(10, 9);
		System.out.println("Result is" + result);
	}
}
