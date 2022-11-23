package com.bridgelabz;

public class GenericsMaximumInt {

	public static int maximum(Integer a1, Integer a2, Integer a3) {
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maximum(2, 6, 8));
	}
}
