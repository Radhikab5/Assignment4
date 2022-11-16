import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		StringBuilder  sb1 = new StringBuilder("2552");
		String s1 = sb1.toString();
		
		String reverseString = sb1.reverse().toString();		
		
		if(s1.equals(reverseString)) {
			System.out.println("This is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
