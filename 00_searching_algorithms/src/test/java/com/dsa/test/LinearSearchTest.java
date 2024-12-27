package com.dsa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dsa.LinearSearch;

public class LinearSearchTest {
	
	@Test
	void linearSearchTest() {
		
		LinearSearch lsAlgo = new LinearSearch();
		int[] input = {1, 2, 3, 4, 10};
		int index = lsAlgo.search(input, 1);
		
		assertEquals(0, index);
		
		
	}

}
