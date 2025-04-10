package in.prec.exceptionhandling.customexception;

import java.util.Scanner;

import in.prec.exceptionhandling.customexception.entities.Student;
import in.prec.exceptionhandling.customexception.exceptions.InvalidNameFormatException;
import in.prec.exceptionhandling.customexception.exceptions.InvalidNegativeRollNoException;
import in.prec.exceptionhandling.customexception.exceptions.InvalidUnderAgeAgeException;

public class MainStudent {

	public static void main(String[] args) {
		Student student = new Student(10,"Temp",20);
//		Scanner scanner = new Scanner(System.in);
		
		try (Scanner scanner = new Scanner(System.in)){
			if(isValid(student)) {
				System.out.println("Valid Input from user");
				
			}else {
				System.out.println("Invalid input from User");
			}
		}catch(InvalidNegativeRollNoException e) {
			student.setRollNo(10);
			System.out.println(e.getMessage());
		}catch(InvalidUnderAgeAgeException e) {
			student.setAge(20);
			System.out.println(e.getMessage());
		}catch(InvalidNameFormatException e) {
			student.setName("Temp");
			System.out.println(e.getMessage());
		}/*finally {
			student=null;
			student.toString();
			scanner.close();
		}*/
		
		System.out.println(student);
	}
	
	public static boolean isValid(Student student) throws InvalidNegativeRollNoException, InvalidUnderAgeAgeException, InvalidNameFormatException{
		boolean flag=false;
		if(student.getRollNo()<=0)
			throw(new InvalidNegativeRollNoException("Roll No must be Positive"));
			
		if(student.getAge()<18)
			throw new InvalidUnderAgeAgeException("Student age must be greater than 18");
			
		if(!student.getName().matches("[A-Z][a-z]{1,14}"))
			throw new InvalidNameFormatException("name format should be [A-Z][a-z]{1,14}");
		
		
		flag=true;
		return flag;
		 
	}
}
