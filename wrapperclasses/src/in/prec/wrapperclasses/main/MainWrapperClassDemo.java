package in.prec.wrapperclasses.main;

public class MainWrapperClassDemo {
	public static void main(String[] args) {
//		int no1 = 10;
//		
////		Integer intObj0 = new Integer(10);
////		Boxing
//		Integer intObj = Integer.valueOf(no1);
////		AutoBoxing
//		Integer intObj1 = no1;
//		
//		
////		UnBoxing
//		no1 = intObj1.intValue(); 
//		
////		AutoUnBoxing
//		no1=intObj;
//		
//		double no2=10D;
//		
//		Double doubleObj= no2;  //Double.valueOf(no2);
//		
//		
//		no2= doubleObj; //doubleObj.doubleValue();
//		
//		
//		
//		boolean flag=true;
//		
//		Boolean booleanObj = flag;//Boolean.valueOf(flag);
//		
//		flag = booleanObj; //booleanObj.booleanValue();
//		
//		
//		doubleObj = intObj.doubleValue();
//		
//		intObj = doubleObj.intValue();
//		
//		System.out.println(Integer.MIN_VALUE);
//		
//		Byte byteObj=10;
		
//		int no = Integer.parseInt("100D");
//		System.out.println(no);
//		
//		short shortNo = Short.parseShort("132");
//		
////		will not throw any exception and returns default value as false
//		boolean bVar=Boolean.parseBoolean("adsf");
//		System.out.println(bVar);
//		-127 to 128 for Integer numbers
		Integer no1=225;
		Integer no2=225;
		System.out.println(no1.equals(no2));
		
		System.out.println(no2.compareTo(no1));
		System.out.println(Integer.toBinaryString(no1));
		
	}

}
