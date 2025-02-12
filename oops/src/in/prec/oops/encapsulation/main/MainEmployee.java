package in.prec.oops.encapsulation.main;

import in.prec.oops.encapsulation.entities.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setId(1);
		System.out.println(emp);
	}
}
