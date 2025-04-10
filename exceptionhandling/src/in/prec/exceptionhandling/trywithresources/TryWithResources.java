package in.prec.exceptionhandling.trywithresources;

import java.util.stream.Stream;

import in.prec.exceptionhandling.customexception.entities.Student;

public class TryWithResources {
	public static void main(String[] args) {
		
		try(Student student = new Student()){
//			try(Stream<Integer> intStream=Stream.of(1,2,3,4,5,6)){
			System.out.println(student);
		}
	}
}
