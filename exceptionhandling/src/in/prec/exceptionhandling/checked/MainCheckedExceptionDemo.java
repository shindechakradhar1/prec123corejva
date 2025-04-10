package in.prec.exceptionhandling.checked;

public class MainCheckedExceptionDemo {
	public static void main(String[] args) throws Exception{
		
		System.out.println("Hi");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Hi");
		
		throw new Exception("hi");
	}
}
