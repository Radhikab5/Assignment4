import java.util.Scanner;

public class MaximumOccuringChar {

	public static void main(String[] args) {
			
		String str="america";
		int maxCount = 0;
		int count=1;
		char maxChar = 0;
		char tempVar = 0;
		for(int i=0; i< (str.length()-1);i++) {
			count =1;
			for(int j=i+1; j< str.length(); j++) {
			
				if(str.charAt(i) == str.charAt(j)) {
					count++; 
					tempVar = str.charAt(i);
				}
				if(maxCount < count) {
					maxCount = count;
					maxChar = tempVar;
					
				}
				
			}
		}
	   if(maxCount>0 && maxChar!=0) {
		   System.out.println("maximum occurance character is "+maxChar);
		   System.out.println("maximum count "+maxCount);
	   
	   }
	   else {
		   System.out.println("Each character occuring only one time ");
	   }

	}

}
