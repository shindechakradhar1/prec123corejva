package in.prec.arrays.sorting.customobject.main;

import in.prec.arrays.sorting.customobject.entities.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		
//		Employee[] empArray = new Employee[5];
//		empArray[0]=new Employee();
//		empArray[1]=new Employee();
//		
//		empArray[0].setAge(35);
//		empArray[0].setName("ABC");
//		empArray[0].setEmpId(1);
//		
//		
//		System.out.println(empArray[0].toString());
//		
//		System.out.println(empArray[1].toString());
		
		Employee[] empArray= {new Employee(1,"ABC",32),new Employee()};
		
		System.out.println(empArray[0].toString());
		
		System.out.println(empArray[1].toString());
	}
}
