package in.prec.java8features.streamapi.entities;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private int age;
	private String area;

	public Student() {}

	public Student(int rollNo, String name, int age, String area) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.area = area;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Student temp=(Student)obj;
		
		return	this.rollNo==temp.rollNo 
			&&	this.name.equals(temp.name)
			&&  this.age==temp.age
			&& 	this.area.equals(temp.area);
	}
	
	@Override
	public int hashCode() {
//		return Objects.hash(rollNo, name, age, area);
		int hash=17;
		hash = hash * 13 + rollNo;
		hash = hash * 13 + name.hashCode();
		hash = hash * 13 + age;
		hash = hash * 13 + area.hashCode();
		return hash;
 	}
	
	@Override
	public int compareTo(Student student) {
//		if(this.rollNo>student.rollNo)
//			return 1;
//		if(this.rollNo==student.rollNo)
//			return 0;
//		return -1;
		return student.rollNo-this.rollNo;
		
//		return this.area.compareTo(student.area);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", area=" + area + "]";
	}

}
