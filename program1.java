package project1;

public class program1 {

	public static void main(String[] args) {
		
		String input_string = args[2];
		System.out.println(input_string);
		System.out.println(input_string instanceof String);
		int age = Integer.parseInt(input_string);
		System.out.println(age);
		//System.out.println(age instanceOf String);
		
		
		String Result = age<18 ? "minor" : age>65 ? "serinor" : "adult";
		System.out.println(Result);
		
	}

}
