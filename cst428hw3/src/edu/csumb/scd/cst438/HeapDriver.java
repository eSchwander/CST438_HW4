package edu.csumb.scd.cst438;

import java.util.List;
import java.util.Arrays;

public class HeapDriver{	
	public static void main(String [ ] args){
		List<Integer> heap = Arrays.asList(3,5,1,9,12);
		
		System.out.println("Heapifying the array: " + heap);
		Heap test = new Heap(heap);
		
		System.out.println("The array is now a heap: " + test);
	}
}