/*
find maximum number in the given array

*/

class Question1
{
	
	int Max(int x[])
	{
		int max=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		return max;
	}
	
  public static void main(String ...s)
  {
		int x[]={4,7,3,9,5,22,10,13,17,};
		Question1 q=new Question1();
		int max = q.Max(x);
		System.out.println("Maximum number in the array is :: "+ max);
  }
}





