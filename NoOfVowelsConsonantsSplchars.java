import java.util.Scanner;

public class NoOfVowelsConsonantsSplchars {

	public static void main(String[] args) {
			
		String actualString="harry-potter!";	
		int vowelCount = 0;
		int consonantCount = 0;
		int specialCharCount = 0;
		
		for(int i =0; i<= (actualString.length()-1) ; i++) {
			
			if(actualString.charAt(i) == 'a' || actualString.charAt(i)=='e' || actualString.charAt(i)=='i' 
					|| actualString.charAt(i)=='o' || actualString.charAt(i) == 'u'
					|| actualString.charAt(i) == 'A' || actualString.charAt(i) == 'E' || actualString.charAt(i) == 'I'
					|| actualString.charAt(i) == 'O' || actualString.charAt(i) == 'U') {
				
				vowelCount++;
				
			}
			  else if((actualString.charAt(i) >= 'a' && actualString.charAt(i)<='z')
					  || (actualString.charAt(i) >= 'A' && actualString.charAt(i)<='Z')) { 
	            consonantCount++;
	        }
			else if(Character.isDigit(actualString.charAt(i))) {
				break;
			}
			else {
				specialCharCount++;
			}
				
						
		}
		System.out.println("Vowel count: "+vowelCount);
		System.out.println("Consonant Count: "+consonantCount);
		System.out.println("Special character count: "+specialCharCount);

	}

}
