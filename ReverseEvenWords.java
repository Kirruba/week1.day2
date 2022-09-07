package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] split = test.split(" ");  //Split the string test by space as delimiter
		char[] ch;

		for(int i=0;i<split.length;i++)
		{
			if(i%2!=0)     				  //To check for the Odd Index in split Array
			{
				ch=split[i].toCharArray();  //Convert the even split word into Character

				for(int j=ch.length-1;j>=0;j--) 
				{
					System.out.print(ch[j]);   //Print the character's of an even word in a reverse order

				}	

			}
			else
			{
				System.out.print(" " +split[i]+ " "); //If it's not an even word print the word without any change

			}	

		}	

	}

}
