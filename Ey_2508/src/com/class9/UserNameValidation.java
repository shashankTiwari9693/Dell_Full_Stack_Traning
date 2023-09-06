package com.class9;

import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd34")); // true

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd347")); // false

		// Mobile Number Validation

		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "9898989899"));

	}

}
