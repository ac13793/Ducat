/*
find Minimum number in the given array

*/

class Question2
{
	
	int Min(int x[])
	{
		int min=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		return min;
	}
	
  public static void main(String ...s)
  {
		int x[]={4,7,3,9,5,22,10,13,17,};
		Question2 q=new Question2();
		int min = q.Min(x);
		System.out.println("Minimum number in the array is :: "+ min);
  }
}





