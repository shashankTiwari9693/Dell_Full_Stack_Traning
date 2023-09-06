package com.class10;

import static java.time.Month.JANUARY;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTimeClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("Current system date is" + today);

		LocalDate indiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current India Date is" + indiaDate);

		LocalDate usDate = LocalDate.now(ZoneId.of("US/outCentral"));
		System.out.println("Current Us Date is" + usDate);

		LocalDate firstDay2023 = LocalDate.of(2023, JANUARY, 1);
		System.out.println("First day of 2023 is" + firstDay2023);

		LocalDate epochDay = LocalDate.ofEpochDay(1000);
		System.out.println("1000th Day from Epoch Date is" + epochDay);

		LocalDate hundredth_Day_of_2020 = LocalDate.ofYearDay(2020, 100);
		System.out.println(hundredth_Day_of_2020);
	}

}
