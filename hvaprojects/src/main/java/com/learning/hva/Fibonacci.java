package com.learning.hva;

public class Fibonacci {
	public int[] fibonacci(int n) {
		int[] fib_series = new int[n];
		if (n < 0) {
			throw new NegativeArraySizeException();
		} else {
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					fib_series[i] = 0;
				} else if (i == 1) {
					fib_series[1] = 1;
				} else {
					fib_series[i] = fib_series[i - 1] + fib_series[i - 2];

				}

			}
		}

		return fib_series;
	}

}
