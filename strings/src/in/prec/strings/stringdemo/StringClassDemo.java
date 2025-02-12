package in.prec.strings.stringdemo;

import java.util.Arrays;

public class StringClassDemo {

	public static void main(String[] args) {
//		String name1="abc";
//		
//		String name2=new String("abc");
//		
//		System.out.println(name1==name2);
//		
//		String name3=new String("abc");
//		
//		System.out.println(name2==name3);
//		
//		String name4 = "abc";
//		
//		System.out.println(name1==name4);
//		
//		System.out.println(name1.equals(name2));
		
		String var1="ABCd 123 4531";
		String var2=new String("ABC");
		char[] charArray = {'1','2','3'};
		String var3 = new String(charArray);
		
		int length=var1.length();
		
		char chAt = var1.charAt(0);
		
		boolean isContains=var1.contains("AB");
		
//		System.out.println(isContains);
		
		String subString1= var1.substring(0);
		String subString2= var1.substring(0,3);
		
		String[] splitResult = var1.split(" "); 
		
		for(String result:splitResult)
			System.out.println(result);
		
		String joinResult=String.join(":", splitResult);
		System.out.println(joinResult);
		
		String name0 = new String("ABC").intern();
		
		String name1="ABC";
		
		String name2="BBCD";
		
		
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareToIgnoreCase(name2));
		
		String uppercaseName1=name1.toUpperCase();
		
		System.out.println(name1==name0);
		
		char[] chArray = name1.toCharArray();
		
		String concatResult=name1.concat(name0);
		System.out.println(concatResult + " " + name1 + " " + name0);
		
		String replaceResult=name1.replace('A', 'Z');
		System.out.println(replaceResult);
		
		String replaceResult1=name1.replace("ZB", "AB");
		
		System.out.println(replaceResult1);
		
		name1=" AbC 123 ";
		System.out.println(name1.trim());
	}
}
