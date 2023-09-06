package com.class9;

import java.util.regex.Pattern;

public class CharacterClassInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]", "a")); //true
		System.out.println(Pattern.matches("[amn]","aa")); //false
		System.out.println(Pattern.matches("[amn]","m"));  //true
		System.out.println(Pattern.matches("[amn]","mn")); //false
		System.out.println(Pattern.matches("[^amn]","z")); //true accept
		
		System.out.println(Pattern.matches("[a-zA-Z]","B")); //true
		System.out.println(Pattern.matches("[a-d[m-p]]","e")); //false
		
		
	}

}
