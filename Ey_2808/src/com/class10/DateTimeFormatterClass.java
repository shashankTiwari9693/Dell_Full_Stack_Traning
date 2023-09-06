package com.class10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Default Format is" + today);
		System.out.println("According To pattern 1" + today.format(DateTimeFormatter.ofPattern("d::MM::uu")));

		System.out.println("According To pattern 2" + today.format(DateTimeFormatter.BASIC_ISO_DATE));

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println("Current date with timestamp" + dateTime);
		System.out.print("According to pattern 2" + dateTime.format(DateTimeFormatter.ofPattern("d::MM::uu:mm::ss")));

	}

}
