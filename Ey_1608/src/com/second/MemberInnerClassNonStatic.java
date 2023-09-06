package com.second;

public  class MemberInnerClassNonStatic {
	private int data = 10;

	class ABC {
		void show() {
			System.out.println("The value of data is" + data);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		MemberInnerClassNonStatic obj = new MemberInnerClassNonStatic();
		MemberInnerClassNonStatic.ABC obj2 = obj.new ABC();
		obj2.show();
	}

}
