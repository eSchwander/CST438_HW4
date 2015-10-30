package edu.csumb.scd.cst438;

import static org.junit.Assert.*;

import java.util.Arrays;

import java.util.List;

import org.junit.Test;

import edu.csumb.scd.cst438.Heap;

public class HeapifyTest {
	
	@Test
	public void testAscending() {
		assertEquals(Arrays.asList(5,4,3,1,2).toString(), new Heap(Arrays.asList(1,2,3,4,5)).toString());
	}
	
	@Test
	public void testDescending(){
		assertEquals(Arrays.asList(5,4,3,2,1).toString(), new Heap(Arrays.asList(5,4,3,2,1)).toString());
	}
	
	@Test
	public void testAscendingMix(){
		assertEquals(Arrays.asList(2,1,0,-2,-1).toString(), new Heap(Arrays.asList(-1,-2,0,1,2)).toString());
	}
	
	@Test
	public void testRandom(){
		assertEquals(Arrays.asList(10,7,5,3,1).toString(), new Heap(Arrays.asList(7,3,5,10,1)).toString());
	}
	
	@Test
	public void testRandomNegative(){
		assertEquals(Arrays.asList(-1,-3,-5,-10,-7).toString(), new Heap(Arrays.asList(-7,-3,-5,-10,-1)).toString());
	}
	
	@Test
	public void testRandomDuplicates(){
		assertEquals(Arrays.asList(7,6,5,5,3).toString(), new Heap(Arrays.asList(5,6,7,5,3)).toString());
	}
	
	@Test
	public void testSizeofOne(){
		assertEquals(Arrays.asList(5).toString(), new Heap(Arrays.asList(5)).toString());
	}
	
	@Test
	public void testAlreadyHeap(){
		assertEquals(Arrays.asList(5,4,3,1,2).toString(), new Heap(Arrays.asList(5,4,3,1,2)).toString());
	}
}
