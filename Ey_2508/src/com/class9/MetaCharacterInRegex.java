
package com.class9;

import java.util.regex.Pattern;

// \d - AnyDigit

// \D = Any Non-Digit

// [^0-9] Anything other than 0 to 9

public class MetaCharacterInRegex {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("\\d", "abc")); // false

		System.out.println(Pattern.matches("\\d", "1")); // true

		System.out.println(Pattern.matches("\\d", "1234")); // false

		System.out.println(Pattern.matches("\\d*", "1234")); // true

		System.out.println(Pattern.matches("\\D", "a")); // true

		System.out.println(Pattern.matches("\\D*", "abc")); // true

		System.out.println(Pattern.matches("\\D*", "123")); // false

		System.out.println("Core Java Regex ".replaceAll("\\s+", "")); // false

	}

}
