
package com.class10;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleAPIUsage {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ResourceBundle rs = ResourceBundle.getBundle("com.class10.TestBundle");

		displayValues(rs);

		Locale swedishLocale = new Locale("sv", "SE");

		ResourceBundle rs2 = ResourceBundle.getBundle("com.class10.TestBundle", swedishLocale);

		displayValues(rs2);

	}

	static void displayValues(ResourceBundle bundle) {

		System.out.println("Hello Message  :" + bundle.getString("my.hello"));

		System.out.println("Hello Message  :" + bundle.getString("my.bye"));

		System.out.println("Hello Message  :" + bundle.getString("my.question"));

	}

}
