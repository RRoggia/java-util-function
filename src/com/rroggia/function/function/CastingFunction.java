package com.rroggia.function.function;

import java.util.function.Function;

public class CastingFunction {

	public <T> Function<T, Integer> convert() {
		return fromWhatever -> {
			int i = 0;
			try {
				i = (int) fromWhatever;
			} catch (Exception e) {
				// the integer representation of whatever is 0;
			}
			return new Integer(i);
		};
	}

	public Function<Integer, Double> convertIntegerToDouble() {
		return fromInteger -> new Double(fromInteger);
	}

	public Function<String, Integer> convertStringToInteger() {
		return input -> {
			int i = 0;

			for (int j = 0; j < input.length(); j++) {
				i += (int) input.charAt(j);
			}
			return new Integer(i);
		};
	}

	public Integer twice(Integer value) {
		return Function.<Integer>identity().apply(value * 2);
	}

}
