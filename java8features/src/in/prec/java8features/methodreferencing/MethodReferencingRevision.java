package in.prec.java8features.methodreferencing;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferencingRevision {

	public static void main(String[] args) {
		
		MethodReferencingRevision obj = new MethodReferencingRevision();
//		static method
//		Function<String, Integer> stringToInt = str->Integer.parseInt(str);
		Function<String, Integer> stringToInt = Integer::parseInt;
		
		System.out.println(stringToInt.apply("123")+10);
		
//		instance method
//		Predicate<Integer> checkIsEven = no->obj.isEven(no);
		Predicate<Integer> checkIsEven = obj::isEven;
		System.out.println(checkIsEven.test(12));
		
//		method of arbitrary object 
//		Function<String, String> toUppercase = (str)->str.toUpperCase();
		Function<String, String> toUppercase = String::toUpperCase;
		
		System.out.println(toUppercase.apply("Priti"));
		
//		Supplier<MethodReferencingRevision> getObject = 
//									()-> new MethodReferencingRevision();
		Supplier<MethodReferencingRevision> getObject = 
				MethodReferencingRevision::new;
									
		System.out.println(getObject.get().isEven(13));
	}
	
	public boolean isEven(int no) {
		return (no%2==0);
	}
}
