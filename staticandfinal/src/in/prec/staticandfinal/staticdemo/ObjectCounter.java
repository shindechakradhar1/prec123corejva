package in.prec.staticandfinal.staticdemo;

public class ObjectCounter {
	
	static int objectCounter;
	
	static {
		objectCounter=10;
		System.out.println("Static block");
	}
	
	int counter;
	
	public ObjectCounter() {
		objectCounter++;
		counter++;
	}
	
	public static void print1(int param) {
		System.out.println("Static Method" + param);
	}
	
	public void print() {
		System.out.println("Static var:" + objectCounter);
		System.out.println("non Static var" + counter);
	}
}
