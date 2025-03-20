package in.prec.java8features.streamapi.entities;

public class Employee {
	private String name;
	private String dept;
	private float salary;
	private int age;

	public Employee() {}

	public Employee(String name, String dept, float salary, int age) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age + "]";
	}

}
