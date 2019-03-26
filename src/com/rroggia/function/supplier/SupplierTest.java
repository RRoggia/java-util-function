package com.rroggia.function.supplier;

import java.util.function.Supplier;

public class SupplierTest {

	public <T> Supplier<T> returnInstanceRandomically(T t, T t2) {
		return () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return ((int) (Math.random() * 10)) / 2 == 0 ? t : t2;
		};
	}

}
