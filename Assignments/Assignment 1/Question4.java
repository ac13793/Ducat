/*
find minimum number in the given 2 - D array

*/

class Question4
{
	
	int Min(int x[][])
	{
		int min=x[0][0];
		for(int i=0;i<x.length;i++)  //x.length give the no . of array
		{
			for(int j=0;j<x[i].length;j++)	//x[i].length give the length of ith of array
			{
				if(x[i][j]<min)
				{
					min=x[i][j];
				}
			}
		}
		return min;
	}
	
  public static void main(String ...s)
  {
		int x[][]={
					{4,7,3},
					{9,5,22,10},
					{13,17}
				};
		Question4 q=new Question4();
		int min = q.Min(x);
		System.out.println("Minimum number in the array is :: "+ min);
  }
}





