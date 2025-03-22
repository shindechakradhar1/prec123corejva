package in.prec.generics.examples.entities;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;

	public Student() {
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student student) {
		return student.name.compareTo(this.name);
//		return student.rollNo-this.rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
