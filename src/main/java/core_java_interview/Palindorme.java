package core_java_interview;

import java.util.Scanner;

public class Palindorme {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string : ");
		name=s.nextLine();
		
		System.out.println("the total length of the string is : " + name.length());
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse + name.charAt(i);
		}
		System.out.println(reverse);
		if(name.equals(reverse))
		{
			System.out.println("plaindrome");
		}else
		{
			System.out.println("not palindrome");
		}

	}

}
