import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "Apple macintosh";			
		String s2 = "Laptop machines";
		if(s1.contains(" ")) {
			s1 = removeSpaces(s1);
		}
		if(s2.contains(" ")) {
			s2 = removeSpaces(s2);
		}
		s1 = convertLowercase(s1);
		s2 = convertLowercase(s2);
		
		s1= stringSorting(s1);
		s2 = stringSorting(s2);
		boolean flag = false;
		for(int i=0; i< s1.length(); i++) {
			
				if(s1.charAt(i) == s2.charAt(i)) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
		
		if(flag == false) {
			System.out.println("It's not Anagram");
		}
		else {
			System.out.println("It's Anagram");

		}

		

	}
    //String sorting without using predefined methods
	private static String stringSorting(String str) {
		char[] chars = str.toCharArray();
		//int j = 0;
	      char temp = 0;
	      
	      for(int i=0; i < chars.length; i++) {
	         for(int j=0; j < chars.length; j++) {
	            if(chars[j] > chars[i]) {
	               temp = chars[i];
	               chars[i] = chars[j];
	               chars[j] = temp;
	            }
	         }
	      }
		return String.valueOf(chars);
	}

	//to remove spaces without using predefined methods
	private static String removeSpaces(String s) {
		String spaceremoved = "";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				spaceremoved += "";
			}
			else {
				spaceremoved+= s.charAt(i);
			}
			
		}
		return spaceremoved;
	}
	//to convert to lowercase
	private static String convertLowercase(String st) {
		char str[]=st.toCharArray();
		for(int i=0;i<str.length;i++)
		{
    		if(str[i]>='A' && str[i]<='Z')
    		{ 
    			str[i]=(char)((int)str[i]+32);
    		}
		}
		String lowercase = String.valueOf(str);
		return lowercase;
	}

}
