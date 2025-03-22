package in.prec.generics.examples;

import java.util.Arrays;

import in.prec.generics.examples.entities.Student;

public class PrintArrays {
	public static void main(String[] args) {
		Integer[] intArray = {1,5,4,6,2,3};
//		print(intArray);
		
		String[] stringArray = {"Sakshi", "Akanksha", "Sanika", "Nikita"};
//		print(stringArray);
		
		Student[] studentArray = {
									new Student(11,"Sakshi"),
									new Student(25,"Akanksha"),
									new Student(13,"Sanika"),
									new Student(44,"Nikita")
								};
		
//		print(studentArray);
		
//		System.out.println("Before Sorting: " + Arrays.toString(stringArray));
//		sort(stringArray);
//		System.out.println("After Sorting: " + Arrays.toString(stringArray));
//		
//		System.out.println("Before Sorting: " + Arrays.toString(intArray));
//		sort(intArray);
//		System.out.println("After Sorting: " + Arrays.toString(intArray));
		
		System.out.println("Before Sorting: " + Arrays.toString(studentArray));
		sort(studentArray);
		System.out.println("After Sorting: " + Arrays.toString(studentArray));
		
	}
	
	public static <E>void print(E[] array) {
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	
	public static <E extends Comparable<E>>void sort(E... array){
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					E temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
	}
	
	
	
}
