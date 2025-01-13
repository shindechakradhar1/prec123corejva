package in.prec.typecasting;

public class Helper {
	
	public void typeCasteFromIntToFloat(int var1) {
		int intVariable=100;
		float floatVariable=1000.1F;
		floatVariable=intVariable;
		System.out.println(floatVariable);
	}
	
	public void typeCasteFromFloatToInt(float var1) {
		int intVariable = 100;
		float floatVariable=1000.2F;
		
		intVariable = (int) floatVariable;
		System.out.println(intVariable);
	}
}
