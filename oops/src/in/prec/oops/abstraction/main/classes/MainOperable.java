package in.prec.oops.abstraction.main.classes;

import in.prec.oops.abstraction.abstracts.classes.Operable;
import in.prec.oops.abstraction.implementing.classes.OperableImpl;

public class MainOperable {
	public static void main(String[] args) {
//		Operable.var=20;
		System.out.println(Operable.var);
		Operable.show();
		Operable operation = new OperableImpl();
		operation.operation();
		operation.print();
	}
}
