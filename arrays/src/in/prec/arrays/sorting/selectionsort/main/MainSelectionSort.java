package in.prec.arrays.sorting.selectionsort.main;

import in.prec.arrays.sorting.selectionsort.SelectionSort;

public class MainSelectionSort {
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		String[] names = {"Anjali", "Nikita", "Diksha", "Priti", "Antara"};
		selectionSort.setStringArray(names);
		selectionSort.selectionSort();
		for(String name:names)
			System.out.print(name + " ");
	}
}
