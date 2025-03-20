package in.prec.association.aggregation.entities;

import java.util.Arrays;

public class Subject {
	private String subject;
	private String department;
	private Teacher[] teachersList;

	public Subject() {
	}

	public Subject(String subject, String department, Teacher[] teacherList) {
		this.subject = subject;
		this.department = department;
		this.teachersList=teacherList;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Subject [subject=" + subject + ", department=" + department 
				+ "Teacher List: " + Arrays.toString(teachersList) +"]";
	}

}
