import java.util.Scanner;

public class DuplicatesRemoval {

	public static void main(String[] args) {
			
		
		String actualString="harry potter";		
		String afterRemoval = new String();
		
		 char[] arr = actualString.toCharArray();
		  
		  for (char value: arr) {
		   if (afterRemoval.indexOf(value) == -1) {
			   afterRemoval += value;
		   }
		  }
		System.out.println("Given String: "+actualString);
		System.out.println("After duplicate removal: "+ afterRemoval);

	}

}
