package com.class8;

import java.util.Scanner;

public class Test1 {

	public String reverseVowels(String str) {
      //Write code here
	  
	  System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		Test1 reverseVowels = new Test1();
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		String reverseString = reverseVowels.reverseVowels(str);
		System.out.print(reverseString);

	}
}
