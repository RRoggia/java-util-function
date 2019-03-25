package com.rroggia.function.predicate;

public class PredicateTests {

	public static void main(String[] args) {

		CountryFilter countryFilter = new CountryFilter();

		System.out.println("All countries: " + countryFilter.countries());

		System.out.println("North Emisphere: " + countryFilter.northEmisphere());
		System.out.println("North Emisphere AND that contains 'S': "
				+ countryFilter.northEmisphere(country -> country.contains("S")));
		System.out.println("North Emisphere AND that contains 'B': "
				+ countryFilter.northEmisphere(country -> country.contains("B")));

		System.out.println("South Emisphere: " + countryFilter.southEmisphere());
		System.out.println("South Emisphere AND that contains 'S': "
				+ countryFilter.southEmisphere(country -> country.contains("S")));
		System.out.println("South Emisphere AND that contains 'B': "
				+ countryFilter.southEmisphere(country -> country.contains("B")));

		System.out.println("Is Canada");
		System.out.println("BR is CA: " + countryFilter.isCanada("BR"));
		System.out.println("BR is CA: " + countryFilter.isCanada("CA"));

	}
}
