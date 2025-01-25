package in.prec.arrays.sorting.bubblesort;

public class BubbleSort {
	String[] stringArray;

	public BubbleSort() {	// TODO Auto-generated constructor stub
	}

	public BubbleSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}
	
	public void sort() {
		String temp;
		for(int i=0;i<stringArray.length;i++)
			for(int j=0;j<stringArray.length-1-i;j++)
				if(stringArray[j].compareTo(stringArray[j+1])>0) {
					temp=stringArray[j];
					stringArray[j]=stringArray[j+1];
					stringArray[j+1]=temp;
				}
	}
}
