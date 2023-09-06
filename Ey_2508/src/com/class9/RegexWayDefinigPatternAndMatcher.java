package com.class9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWayDefinigPatternAndMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".o");

		Matcher m = p.matcher("Co");
		boolean result = m.matches();
		System.out.println("Match Result -" + result);
		
		boolean sameReault2= Pattern.compile(".a").matcher("a").matches();
		System.out.println("Reault is "+ sameReault2);
		
		boolean sameReault3=Pattern.matches(".q", "Pq");
		System.out.println("Result is "+ sameReault3);

	}

}
