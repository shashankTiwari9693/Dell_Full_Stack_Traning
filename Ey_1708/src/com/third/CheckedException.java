package com.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		Reader r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		String str;
		try {
//			
			do {
				System.out.println("Please enter sth, i will read it for you");
				str = br.readLine();
				System.out.println("what you have entered is " + str);
			} while (!str.equalsIgnoreCase("exit"));
		} catch (IOException e) {

			e.printStackTrace();
		} finally {          //exception aaye ya na aaye finally hamesha chalta h
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
