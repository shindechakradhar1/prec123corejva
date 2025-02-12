package in.prec.strings.stringdemo;

public class StringBuilderClassDemo {

	public static void main(String[] args) {
//		StringBuilder sBuilder = "ABC";
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("ABC");
		sBuilder.append("BBC12345678900");
		System.out.println(sBuilder.length());
		
		System.out.println(sBuilder.capacity());
		
		System.out.println(sBuilder.toString());
		
		
//		sBuilder.deleteCharAt(0);
		sBuilder.delete(0,10);
		
		System.out.println(sBuilder);
		
		sBuilder.setCharAt(0, (char)65);
		
		System.out.println(sBuilder);
		
		sBuilder.insert(0, (char) 65);
		
		System.out.println(sBuilder);
		
		sBuilder.reverse();
		
		System.out.println(sBuilder);
		
		String result = sBuilder.toString();
		
		
	}
}
