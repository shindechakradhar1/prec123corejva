package in.prec.exceptionhandling.nestedtrycatch;

public class NestedTryCatchDemo {
	public static void main(String[] args) {
		try {
			int no=10/2;
			
			try {
				String name="ABC";
				name.charAt(0);
				int[] intArray = {1,2,3,4,5,6};
				no=intArray[6];
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello");
	}

}
