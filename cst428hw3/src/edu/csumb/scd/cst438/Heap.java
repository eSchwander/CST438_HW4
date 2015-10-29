package edu.csumb.scd.cst438;

import java.util.List;
import java.util.StringTokenizer;

public class Heap {

	private List<Integer> heap;
	
	// takes in list of numbers separated by spaces
	public Heap(List<Integer> list){
		heap = list;
		if(!isHeap()){
			heapify(heap);
		}
	}
	
	public boolean isHeap(){
		for (int i = 0; i < heap.size() / 2; i++){
			if (heap.get(i * 2 + 1) > heap.get(i) || heap.get(i * 2 + 2) > heap.get(i))
				return false;
		}
		return true;
	}
	
	public void heapify(List<Integer> heap){
		Integer temp;
		boolean finished = false;
		while(!finished){
			finished = true;
			for (int i = heap.size() - 1; i >= 0; i--){
				if(heap.get(i) > heap.get(i/2)){
					temp = heap.get(i);
					heap.set(i, heap.get(i/2));
					heap.set(i/2, temp);
					finished = false;
				}
			}
		}
	}
	
	public String toString(){
		return heap.toString();
	}
	
	public boolean equals(Object object){
		return heap.toString() == object.toString();
	}
	
}
