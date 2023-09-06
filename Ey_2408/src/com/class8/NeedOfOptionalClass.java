//package com.programming.class7;

//

////TO avoid overhead of checking null object again and again

//

//public class NeedOfOptionalClass {

//

//    public static void main(String[] args) {

//        // TODO Auto-generated method stub

//        String[] words = new String[10];

//        String word = words[5].toLowerCase();

//        System.out.println(word);

//    }

//

//}

package com.class8;

//TO avoid overhead of checking null object again and again

public class NeedOfOptionalClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String[] words = new String[10];

		String word = "";

		if (null != words[5]) {

			word = words[5].toLowerCase();

		} else {

			System.out.println("Values at 5th index was null");

		}

		System.out.println(word);

	}

}