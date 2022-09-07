package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="madam";
		String rev="";
		char[] ch=test.toCharArray();

		for (int i=test.length()-1; i>=0; i--) 
		{
			rev=rev+ch[i];       //Reversed string by Adding the character into rev 

		}
		if(test.equalsIgnoreCase(rev))  //Compare the original String with the reversed String
		{
			System.out.println("It is a Palindrome");

		}
		else
		{
			System.out.println("It is not a Palindrome");

		}
	}

}
