package garbagecollection;

public class Student {
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	public void finalize() {
		System.out.println("Hello");
	}
}
