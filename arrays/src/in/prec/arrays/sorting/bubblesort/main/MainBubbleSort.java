package in.prec.arrays.sorting.bubblesort.main;

import java.util.Arrays;

import in.prec.arrays.sorting.bubblesort.BubbleSort;

public class MainBubbleSort {
	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		String[] sArray = {"Ruchika", "Komal", "Aishwarya", "Diksha"};
		sort.setStringArray(sArray);
		sort.sort();
//		System.out.println(Arrays.toString(sArray));
		for(int i=0;i<sArray.length;i++)
			System.out.print(sArray[i] + " ");
	}
}
