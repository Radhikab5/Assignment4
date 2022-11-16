import java.awt.image.ConvolveOp;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		String s1="THE qUICK bROWN FOX JUMPS OVER THE LAZY DOG";
		
		s1=removeSpaces(s1);
		s1 = convertLowercase(s1);
		
		for (char ch = 'a'; ch <= 'z'; ch++)   
		{  
		if (!s1.contains(String.valueOf(ch)))   
		{  
		flag = false;  
		break;  
		}  
		}  
		if(flag)
		{
		System.out.println("It's pangram");
		}
		else {
			System.out.println("It's not a pangram");
		}


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
