package com.bridgelabz;

public class GenericsMaximum {

	public static int maximum(Integer a1, Integer a2, Integer a3) {
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static float floatMaximum(Float a1, Float a2, Float a3) {
		Float max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maximum(2, 6, 8));
		System.out.println(floatMaximum(2.5f, 6.8f, 8.8f));

	}

}