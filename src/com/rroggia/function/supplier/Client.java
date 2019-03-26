package com.rroggia.function.supplier;

import java.util.function.Supplier;

public class Client {

	public static void main(String[] args) {
		SupplierTest supplier = new SupplierTest();

		System.out.println("get a supplier of the result");
		Supplier<String> resultString = supplier.returnInstanceRandomically("first", "second");
		Supplier<Integer> resultInteger = supplier.returnInstanceRandomically(10, 20);

		System.out.println("need to do something urgent here, and don't matter the result");

		System.out.println("after processed something important, get the result, which takes times");
		System.out.println(resultString.get());
		System.out.println(resultInteger.get());

	}

}
