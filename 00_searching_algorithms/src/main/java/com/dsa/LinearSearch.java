package com.dsa;

public class LinearSearch {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 5, 10 };
		int item = 1;

		LinearSearch ls = new LinearSearch();
		int result = ls.search(input, item);
		System.out.println("Search result : " + result);

	}

	public int search(int[] input, int item) {

		for (int i = 0; i < input.length; i++) {
			if (input[i] == item) {
				return i;
			}
		}
		return -1;
	}
}
