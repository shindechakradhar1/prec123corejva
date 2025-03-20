package in.prec.association.aggregation.entities;

public class Teacher {
	private String name;
	private int experience;
	private Subject[] subjectList;

	public Teacher() {}

	public Teacher(String name, int experience, Subject[] subjectList) {
		this.name = name;
		this.experience = experience;
		this.subjectList = subjectList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", experience=" + experience + "]";
	}

}
