package java_programs;

public class Methods_String {
	
	static String name="venkatesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// .charAt(index value) method will break the string into individual characters and will provide the character at the particular index value
		System.out.println(name.charAt(3));
		
		// .indexOf('h') method will provide the index of the character we need
		System.out.println((name.indexOf('h')));
		
		// .substring(3, 7) will have two arguments start and end index
		System.out.println(name.substring(3, 7));
		
		// .concat(" swaminathan") to concat the string
		System.out.println(name.concat(" swaminathan"));
		
		
		
		

	}

}
