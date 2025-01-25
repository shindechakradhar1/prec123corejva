package in.prec.arrays.sorting.selectionsort;

public class SelectionSort {
	String[] stringArray;

	public SelectionSort() {}

	public SelectionSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}
	
	public void selectionSort() {
		int minIndex;
		String temp;
		for(int i=0;i<stringArray.length-1;i++) {
			 minIndex=i;
			for(int j=i+1;j<stringArray.length;j++) {
				if(stringArray[minIndex].compareTo(stringArray[j])>0)
					minIndex=j;
			}
			temp=stringArray[minIndex];
			stringArray[minIndex]=stringArray[i];
			stringArray[i]=temp;
			
		}
	}

}
