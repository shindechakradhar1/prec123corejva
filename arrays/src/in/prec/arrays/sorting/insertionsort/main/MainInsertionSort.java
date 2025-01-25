package in.prec.arrays.sorting.insertionsort.main;

import java.util.Arrays;

import in.prec.arrays.sorting.insertionsort.InsertionSort;

public class MainInsertionSort {
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		String[] names = {"Loni", "Shirdi", "Rahata", "Kopargao", "Dadh"};
		
		insertionSort.setStringArray(names);
		insertionSort.insertionSort();
		System.out.println(Arrays.toString(names));
	}
}
