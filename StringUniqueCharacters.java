import java.util.Scanner;

public class StringUniqueCharacters {

	public static void main(String[] args) {
			
		String str="Graco";		 
		  boolean flag = false;
		  for(int i= 0 ; i < str.length() ; i++) {
			 for(int j=i+1; j< str.length() ; j++) {
				 if(str.charAt(i) == str.charAt(j)) {
					 flag = true;
					 break;
				 }
			 }
		  }
		  if(flag == false) {
			  System.out.println("String contains all unique characters");
		  }
		  else {
			  System.out.println("All characters are not unique");
		  }

	}

}
