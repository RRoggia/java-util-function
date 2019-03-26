package com.rroggia.function.function;

public class Client {

	public static void main(String[] args) {
		CastingFunction cf = new CastingFunction();

		System.out.println("convert 'Test' to Integer, and then convert Integer to Double");
		System.out.println("Same as:");
		System.out.println("Integer a = cf.convert().apply('Test')");
		System.out.println("Double b = cf.convertIntegerToDouble(a)");
		System.out.println("String: " + cf.convert().andThen(cf.convertIntegerToDouble()).apply("Test"));
		System.out.println();

		System.out.println("convert 50 to Integer, and then convert Integer to Double");
		System.out.println("Same as:");
		System.out.println("Integer a = cf.convert().apply(50)");
		System.out.println("Double b = cf.convertIntegerToDouble(a)");
		System.out.println("Integer: " + cf.convert().andThen(cf.convertIntegerToDouble()).apply(50));
		System.out.println();

		System.out.println("convert 'Test' to Integer, and then Integer to Double");
		System.out.println("Integer a = cf.convertStringToInteger().apply('Test')");
		System.out.println("Double b = cf.convertIntegerToDouble(a)");
		System.out.println("String: " + cf.convert().compose(cf.convertStringToInteger()).apply("Test"));

		System.out.println("twice(2): " + cf.twice(2));

	}

}
