package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] charArray=test.toCharArray();  //to convert string to char

		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(Character.toUpperCase(charArray[i]));	//convert odd Index character to UpperCase

			}
			else
			{
				System.out.print(charArray[i]);

			}

		}

	}

}
