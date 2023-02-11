package com.hva.learning;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FibonacciTest {

	@Test
	public void test() {
		Fibonacci f = new Fibonacci();

		int[] actual = {  };

		assertArrayEquals(actual, f.fibonacci(0));
	}

	public void test1() {
		Fibonacci f = new Fibonacci();

		int[] actual = { 0,1 };

		assertArrayEquals(actual, f.fibonacci(1));
	}

	public void test2() {
		Fibonacci f = new Fibonacci();

		int[] actual = { 0, 1 };

		assertArrayEquals(actual, f.fibonacci(2));
	}

	public void test3() {
		Fibonacci f = new Fibonacci();

		int[] actual = { 0, 1, 1, 2, 3, 5, 8 };

		assertArrayEquals(actual, f.fibonacci(7));
	}

	@Test(expected = NegativeArraySizeException.class)
	public void testNegative() {
		Fibonacci f = new Fibonacci();

		f.fibonacci(-1);
	}

}
