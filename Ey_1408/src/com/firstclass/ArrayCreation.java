package com.firstclass;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] intArr	 =new int[6];
intArr[0]=10;
intArr[1]=20;
intArr[2]=40;
intArr[3]=50;
intArr[4]=70;
intArr[5]=90;
		
String[] strArr= {"A","B","C","D","E"};

//traverse
for(int i=0;i<=intArr.length-1;i++) {
	System.out.print(intArr[i]+"");
}
System.out.println();
for(int i=0;i<strArr.length;i++) {
	System.out.print(strArr[i]+" ");
}
System.out.println();
for(int i:intArr) {
	System.out.print(i+"");
}
}
}
