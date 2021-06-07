package p05.api;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier is = new IntSupplier() {
			@Override
			public int getAsInt() {
				int num = (int) (Math.random() * 6 + 1);
				return num;
			}
		};
		System.out.println(is.getAsInt());
	}

}
