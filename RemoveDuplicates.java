package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = text.split(" "); //Split the string text by space as delimiter

		for(int i=0;i<split.length;i++)
		{
			for(int j=i+1;j<split.length;j++)
			{
				if(split[i].equals(split[j]))  //To Check for duplicate words
				{
					count++;				  //If duplicate word is found increment the count value

					split[j]="";			  //Replace the duplicate words as null

				}

			}

		}		
		if(count>1)
		{
			for(int k=0;k<split.length;k++)
			{
				System.out.print(split[k]+" "); //Print the words after removing duplicates

			}

		}	

	}

}
