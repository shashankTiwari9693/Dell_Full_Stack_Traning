package com.class6;

@FunctionalInterface
interface isFunctional {
	void show(String data);
}

public class LambdaExpressionSecondExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isFunctional obj = new isFunctional() {

			@Override
			public void show(String data) {
				// TODO Auto-generated method stub
				System.out.println("Using Anonymous Inner" + data);
			}
		};
		obj.show("Class way of implementtaion");

		isFunctional obj2 = (demoData) -> {
			System.out.println("Elimenating Anonymous Inner" + demoData);
		};
		obj2.show("Class way of implementation-Through lambda Expression");
	}

}
