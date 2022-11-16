import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
				
		String actualString= "harry potter";
		int count = 1;
		 char[] arr = actualString.toCharArray();
		 System.out.println("Given string is: "+actualString);
		 System.out.print("Duplicate characters are: ");
		  
		 for (int i = 0; i < actualString.length(); i++) {
			 count = 1;
			   for (int j = i + 1; j < actualString.length(); j++) {
			    if (arr[i] == arr[j] ) {
			    	count++;
			     arr[j] ='0';
			     
			    }
			   }
			   if(count>1 && arr[i]!='0') {
				   System.out.print(arr[i]+" ");
			   }
		 }
		 

	}

}
