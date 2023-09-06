package com.class9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAStringWithRegex {

	private static final String REGEX = "Java";
	private static String INPUT_STRING = "Core Java Programing Language";
	private static final String REPLACED_STRING="Java Regex Concept";
	
	static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		INPUT_STRING = m.replaceAll(REPLACED_STRING);
		System.out.println("Replaced String is"+INPUT_STRING);

	}

}
