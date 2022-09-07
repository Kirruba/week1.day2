package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A1={3,2,11,4,6,7}; //Declaration of Array A1
		int[] A2={1,2,8,4,9,7};  //Declaration of Array A2

		for(int i=0;i<A1.length;i++)
		{
			for(int j=0;j<A2.length;j++)
			{
				if(A1[i]==A2[j])  //To Compare both Arrays for common values
				{
					System.out.println(A1[i]); //To Print common values from both Arrays

				}

			}

		}

	}

}
