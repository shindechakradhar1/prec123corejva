package in.prec.logicalprograms.reversestring;

public class ReverseString {
	String name;
	
	public ReverseString() {}
	
	public ReverseString(String name) {
		this.name=name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String reverseString() {
		char[] chArray=name.toCharArray();
		int left=0;
		int right=name.length()-1;
		char temp;
		while(left<right) {
			temp=chArray[left];
			chArray[left]=chArray[right];
			chArray[right]=temp;
			left++;
			right--;
		}
		
		return new String(chArray);
	}
	
	public String reverseStringLine() {
		String[] strArray=name.split(" ");
		int left=0;
		int right=strArray.length-1;
		String temp;
		while(left<right) {
			temp=strArray[left];
			strArray[left]=strArray[right];
			strArray[right]=temp;
			left++;
			right--;
		}
		
		return String.join(" ", strArray);
	}
}
