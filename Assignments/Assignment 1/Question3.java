/*
find maximum number in the given 2 - D array

*/

class Question3
{
	
	int Max(int x[][])
	{
		int max=x[0][0];
		for(int i=0;i<x.length;i++)  //x.length give the no . of array
		{
			for(int j=0;j<x[i].length;j++)	//x[i].length give the length of ith of array
			{
				if(x[i][j]>max)
				{
					max=x[i][j];
				}
			}
		}
		return max;
	}
	
  public static void main(String ...s)
  {
		int x[][]={
					{4,7,3},
					{9,5,22,10},
					{13,17}
				};
		Question3 q=new Question3();
		int max = q.Max(x);
		System.out.println("Maximum number in the array is :: "+ max);
  }
}





