package in.prec.oops.inheritance.superclasses;

public class Animal {
	private int age;
	private int height;

	public Animal() {
		System.out.println("Animal Constructor");
	}

	public Animal(int age, int height) {
		this.age = age;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", height=" + height + "]";
	}

}
