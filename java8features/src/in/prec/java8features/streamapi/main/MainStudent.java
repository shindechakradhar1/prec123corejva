package in.prec.java8features.streamapi.main;

import java.util.Arrays;
import java.util.stream.Stream;

import in.prec.java8features.streamapi.entities.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student[] studentArray = new Student[6];
		studentArray[0]=new Student(4,"Priti",20,"Rahata");
		studentArray[1]=new Student(3,"Sanika",21,"Shirdi");
		studentArray[2]=new Student(1,"Nikita",20,"Loni");
		studentArray[3]=new Student(2,"Sakshi",22,"Akole");
		studentArray[4]=new Student(5,"Aditi",22,"Loni");
		studentArray[5]=new Student(5,"Aditi",22,"Loni");
		
		
		//Arrays.stream();
		
		//Stream.of();
		
		Stream<Student> studentStream=Arrays.stream(studentArray);
		
//		studentStream
//			.filter(e->e.getArea().equals("Loni"))
//			.filter(e->e.getAge()>20)
//			.forEach(e->System.out.println(e));
		
//		studentStream.map(e->e.getAge()).distinct().forEach(e->System.out.println(e));
		
//		studentStream
//			.map(e->e.getArea())
//			.distinct()
//			.sorted()
//			.forEach(e->System.out.println(e));
		
//		studentStream
//			.distinct()
//			.sorted()
//			.limit(2)
//			.forEach(e->System.out.println(e));
		studentStream
		.distinct()
		.sorted()
		.skip(2)
		.forEach(e->System.out.println(e));
		
		studentStream.close();
	}
}
