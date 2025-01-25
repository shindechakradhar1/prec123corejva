package in.prec.arrays.sorting.insertionsort;

public class InsertionSort {
	String[] stringArray;

	public InsertionSort() {
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public InsertionSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public void insertionSort() {
		String key;
		int j;
		for (int i = 1; i < stringArray.length; i++) {
			key = stringArray[i];
			j=i-1;
			while(j>=0 && key.compareTo(stringArray[j])<0) {
				stringArray[j+1]=stringArray[j];
				j--;
			}
			stringArray[j+1]=key;
		}
	}
}
