package com.rroggia.function.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CountryFilter {
	private static List<String> COUNTRIES_IN_NORTH_EMISPHERE = Arrays.asList("US", "CA", "PT", "IT", "ES", "RU");
	private static List<String> COUNTRIES = Arrays.asList("US", "BR", "CA", "PT", "IT", "ES", "RU", "SA");

	private ArrayList<String> filter(Predicate<String> filter) {
		ArrayList<String> filteredCountries = new ArrayList<>();
		for (String country : COUNTRIES) {
			if (filter.test(country))
				filteredCountries.add(country);
		}
		return filteredCountries;
	}

	public ArrayList<String> northEmisphere() {
		return filter(this.inNorthEmisphere());
	}

	public ArrayList<String> northEmisphere(Predicate<String> andCustomFilter) {
		return filter(this.inNorthEmisphere().and(andCustomFilter));
	}

	public ArrayList<String> southEmisphere() {
		return filter(this.inSouthEmisphere());
	}

	public ArrayList<String> southEmisphere(Predicate<String> andCustomFilter) {
		return filter(this.inSouthEmisphere().and(andCustomFilter));
	}

	public ArrayList<String> countries() {
		return filter(inNorthEmisphere().or(inSouthEmisphere()));
	}

	public boolean isCanada(String country) {
		return Predicate.isEqual(country).test("CA");
	}

	private Predicate<String> inNorthEmisphere() {
		return country -> {
			return COUNTRIES_IN_NORTH_EMISPHERE.contains(country);
		};
	}

	private Predicate<String> inSouthEmisphere() {
		return inNorthEmisphere().negate();
	}

}
