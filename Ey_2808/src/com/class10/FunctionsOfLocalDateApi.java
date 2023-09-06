package com.class10;

import java.time.LocalDate;
import java.time.LocalTime;

public class FunctionsOfLocalDateApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		LocalDate today = LocalDate.now();
		System.out.println("Year" + today.getYear() + "is a leap year or" + "not" + today.isLeapYear());

		System.out.println("Current Time is " + today.atTime(LocalTime.now()));

		System.out.println("10 Days after today will be " + today.plusDays(10));

		System.out.println("3 Weeks after today will be " + today.plusWeeks(3));

		System.out.println("20 Months after today will be " + today.plusMonths(20));

		System.out.println("10 Days before today was " + today.minusDays(10));

		System.out.println("3 weeks before today was " + today.minusWeeks(3));

		System.out.println("20 Months before today was " + today.minusMonths(20));

	}

}
