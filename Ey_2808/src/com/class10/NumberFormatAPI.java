package com.class10;

import java.text.DateFormat;

import java.text.NumberFormat;

import java.util.Currency;

import java.util.Date;

import java.util.Locale;

//import java.util.ITALY;

public class NumberFormatAPI {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		long number = 5000L;

		NumberFormat nf = NumberFormat.getInstance();

		System.out.println("number format using default localr is" + nf.format(number));

		NumberFormat italynf = NumberFormat.getInstance(Locale.ITALY);

		System.out.println("number format using default localr is" + italynf.format(number));

		NumberFormat usingItalianCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);

		System.out.println("number format using default localr is" + usingItalianCurrency.format(number));

		Currency usd = Currency.getInstance("USD");

		NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);

		// nf

		Date currentDate = new Date();

		DateFormat germanDF = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);

		System.out.println("date format using german locale time " + germanDF.format(currentDate));

	}

}
