/*
Add each column , each row and both the diagonal of two matrix
*/
class Question11
{
	
	void printMatrixX(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
	}
	
	void printRowSum(int x[][])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" Sum of Row "+(i+1) +"::\t");
			for(int j=0;j<x[i].length;j++)
			{
				//System.out.print(x[i][j]+"\t");
				sum += x[i][j];
			}
			System.out.println(sum);
			sum=0;
		}
		System.out.println("\n");
	}
	
	void printColumnSum(int x[][])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" Sum of column "+(i+1) +"::\t");
			for(int j=0;j<x[i].length;j++)
			{
				sum += x[j][i];
			}
			System.out.println(sum);
			sum=0;
		}
		System.out.println("\n");
	}
	
	void printDiagonalSumLtoR(int x[][])
	{
		int sum=0;
		System.out.print(" Sum of diagonal elements L to R ::\t");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(i==j)
				sum += x[i][j];
			}
			
		}
		System.out.println(sum);
		System.out.println("\n");
	}
	void printDiagonalSumRtoL(int x[][])
	{
		int sum=0;
		System.out.print(" Sum of diagonal elements R to L ::\t");
		for(int i=0;i<x.length;i++)
		{
			for(int j=(x[i].length-1);j>=0;j--)
			{
				if((i+j)==(x[i].length-1))
				{
					sum += x[i][j];
				}
			}
			
		}
		System.out.println(sum);
		System.out.println("\n");
	}
	
	public static void main(String ...s)
	{
		int x[][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					};

		Question11 q = new Question11();
		System.out.println("\n");
		System.out.println("----Matrix 1-----\n");
		q.printMatrixX(x);
		q.printRowSum(x);
		q.printColumnSum(x);
		q.printDiagonalSumLtoR(x);
		q.printDiagonalSumRtoL(x);
	}
}