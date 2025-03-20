package in.prec.association.aggregation;

import in.prec.association.aggregation.entities.Address;
import in.prec.association.aggregation.entities.Student;
import in.prec.association.aggregation.entities.Subject;
import in.prec.association.aggregation.entities.Teacher;

public class MainStudent {
	public static void main(String[] args) {
		
		Teacher[] mathTeacher = new Teacher[2];
		Teacher[] ecTeacher = new Teacher[2];
		Teacher[] aimlTeacher = new Teacher[2];
		mathTeacher[0] = new Teacher("ABC", 6,null);
		mathTeacher[1] = new Teacher("BBC", 6,null);
		ecTeacher[0] = new Teacher("CBC", 6,null);
		ecTeacher[1] = new Teacher("DBC", 6,null);
		aimlTeacher[0] = new Teacher("EBC", 6,null);
		aimlTeacher[1] = new Teacher("FBC", 6,null);
		
		Address address = new Address();
		address.setArea("Loni BK");
		address.setCity("Ahilya Nagar");
		address.setPincode(413736);
		
		Student student1 = new Student();
		student1.setRollNo(1);
		student1.setName("Diksha");
		student1.setAge(20);
		student1.setAddress(address);
		
		Subject[] temp=student1.getSubject();
		temp[0]=new Subject("Math", "ECE",mathTeacher);
		temp[1]=new Subject("EC", "ECE",ecTeacher);
		temp[2]=new Subject("AIML", "ECE",aimlTeacher);
		
		System.out.println(student1);
	}
}
