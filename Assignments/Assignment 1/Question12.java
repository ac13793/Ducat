/*
for A triangle

1	2	3
4	5	6
7	8	9
*/

class Question12
{	
	
	int triangleAmin(int x[][])
	{
		int min = x[0][0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(min>x[i][j]&&(j>=i))
				{
					min = x[i][j];
				}
			}
		}
		//System.out.println("minimum value in triangle A ::"+min);
		return min;
	}
	
	int triangleAmax(int x[][])
	{
		int max = x[0][0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(max<x[i][j]&&(j>=i))
				{
					max = x[i][j];
				}
			}
		}
		//System.out.println("Maximum value in triangle A ::"+max);
		return max;
	}
	
	int triangleAsum(int x[][])
	{
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(j>=i)
				{
					sum +=x[i][j];
				}
			}
		}
		//System.out.println("Sum of the  value of triangle A ::"+sum);
		return sum;
	}
	
	
	
	
	
	
	
	int triangleBmin(int x[][])
	{
		int min = x[0][0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(min>x[i][j]&&(j<=i))
				{
					min = x[i][j];
				}
			}
		}
		//System.out.println("minimum value in triangle B ::"+min);
		return min;
	}
	
	int triangleBmax(int x[][])
	{
		int max = x[0][0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(max<x[i][j]&&(j<=i))
				{
					max = x[i][j];
				}
			}
		}
		//System.out.println("Maximum value in triangle B ::"+max);
		return max;
	}
	
	int triangleBsum(int x[][])
	{
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(j<=i)
				{
					sum +=x[i][j];
				}
			}
		}
		//System.out.println("Sum of the  value of triangle B ::"+sum);
		return sum;
	}
	
	
	
	
	
	
	
	
	
	void printTriangle(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("*********Triangle A*************");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(j>=i)
				System.out.print(x[i][j] + "\t");
				else
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("*********Triangle B*************");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(j<=i)
				System.out.print(x[i][j] + "\t");
				else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String ...s)
	{
		int y[][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					};
		Question12a q  = new Question12a();
		q.printTriangle(y);
		
		int minA = q.triangleAmin(y);
		System.out.println("minimum value in triangle A ::"+minA);
		int maxA = q.triangleAmax(y);
		System.out.println("Maximum value in triangle A ::"+maxA);
		int sumA = q.triangleAsum(y);
		System.out.println("Sum of the  value of triangle A ::"+sumA);
		System.out.println();
		int minB = q.triangleBmin(y);
		System.out.println("minimum value in triangle B ::"+minB);
		int maxB = q.triangleBmax(y);
		System.out.println("Maximum value in triangle B ::"+maxB);
		int sumB = q.triangleBsum(y);
		System.out.println("Sum of the  value of triangle B ::"+sumB);
		
	}
}