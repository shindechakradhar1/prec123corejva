package in.prec.association.aggregation.entities;

import java.util.Arrays;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private Address address;
	private Subject[] subjects=new Subject[3];

	public Student() {
	}

	public Student(int rollNo, String name, int age, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.address=address;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setSubjects(Subject[] subjects) {
		this.subjects=subjects;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Subject[] getSubject() {
		return subjects;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", address=" + address 
				+ "Subjects: " + Arrays.toString(subjects)  + "]";
	}

}
