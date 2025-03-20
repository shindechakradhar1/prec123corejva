package in.prec.java8features.streamapi;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import in.prec.java8features.streamapi.entities.Employee;

public class EmployeeTerminalOperationMain {
	public static void main(String[] args) {
//		Employee[] empArray = new Employee[7];
		
		Stream<Employee> empStream= Stream.of(
				new Employee("Akshay", "Canteen", 6000, 50)
				, new Employee("Hritik", "Canteen", 5000, 56)
				, new Employee("Arjun", "Hostel", 8000, 43)
				, new Employee("Vicky", "Account", 10000, 35)
				, new Employee("Ranveer", "Comp", 35000, 37)
				, new Employee("Govinda", "Account", 15000, 48)
				, new Employee("Ajay", "Canteen", 7000, 51)
				);
		
		empStream
			.filter(e->e.getDept().equals("Canteen"))
			.filter(e->e.getName().charAt(0)=='A')
			.forEach(System.out::println);
//		long count=empStream
//		.filter(e->e.getDept().equals("Canteen"))
//		.filter(e->e.getName().charAt(0)=='A')
//		.count();
//		
//		System.out.println(count);
		
//		float sum=empStream
//		.filter(e->e.getDept().equals("Account"))
//		.map(e->e.getSalary())
//		.reduce(10000F,(e1,e2)->e1+e2);
//		
//		System.out.println(sum);
		
//		String[] names=empStream
//		.filter(e->e.getDept().equals("Canteen"))
//		.map(e->e.getName())
//		.sorted()
//		.toArray(String[]::new);
//		
//		System.out.println(Arrays.toString(names));
		
//		Optional<Employee> maxSalaryEmployee=empStream
//		.filter(e->e.getDept().equals("Canteen"))
//		.max((e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
//		
//		maxSalaryEmployee.ifPresent(e->System.out.println(e));
		
//		Optional<Employee> minSalaryEmployee=empStream
//		.filter(e->e.getDept().equals("Canteen"))
//		.min((e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
//		
//		if(minSalaryEmployee.isPresent())
//			System.out.println(minSalaryEmployee.get());
		
//		Optional<Float> salarySum=empStream
//		.filter(e->e.getDept().equals("Account"))
//		.map(e->e.getSalary())
//		.reduce((e1,e2)->e1+e2);
		
//		float salarySum=empStream
//				.filter(e->e.getDept().equals("Account"))
//				.map(Employee::getSalary)
//				.reduce(1000F,(e1,e2)->e1+e2);
////		
//		System.out.println(salarySum);
		
//		salarySum.ifPresent(e->System.out.println(e));
		
		
//		Integer[] ageArray=empStream
//		.filter(e->e.getDept().equals("Canteen"))
//		.map(e->e.getAge())
//		.sorted()
//		.toArray(Integer[]::new);
//		
//		for(int i=0;i<ageArray.length;i++)
//			System.out.println(ageArray[i]);
		
		empStream.close();
	}
}
