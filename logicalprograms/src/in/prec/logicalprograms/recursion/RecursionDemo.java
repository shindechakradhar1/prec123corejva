package in.prec.logicalprograms.recursion;

public class RecursionDemo {

		public void print(int no) {
			// base condition
			if(no>1)
				print(no-1);	
			
			System.out.println(no+10);	
		}
		
		public int print1(int no) {
//			if(no<=0)
//				return 1;
//			else 
//				return no * print1(no-1);
			
			return (no<=0) ? 1: no*print1(no-1);
		}
		
		public int power(int base, int exp){
			return (exp<=1)? base: base * power(base, exp-1);
		}
		
		public void reverseCharacter(char[] charArray, int i) {
			if(i<(charArray.length-1))
				reverseCharacter(charArray, i+1);
			
			System.out.print(charArray[i]);
		}
}
