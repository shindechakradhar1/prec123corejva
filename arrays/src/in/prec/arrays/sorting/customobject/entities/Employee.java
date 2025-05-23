package in.prec.arrays.sorting.customobject.entities;

public class Employee {
	private int empId;
	private String name;
	private int age;

	public Employee() {}

	public Employee(int empId, String name, int age) {
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}

}
