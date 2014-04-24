/*
Multiplication of two matrix
*/
class Question10
{
	void matrixSum(int x[][],int y[][])
	{
		int len = x.length+y.length;
		int c[][] = new int[x.length][y.length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<x.length;k++)
				{
				c[i][j]= c[i][j]+(x[i][k]*y[k][j]);
				}
			}
		}
		System.out.println("******** 	Multiplication of Two Matrix 	*********");
		System.out.println("\n");
		this.printSum(c);
	}
	
	void printMatrixXY(int x[][] ,int y[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.print("\t||\t");
			this.printMatrixY(y,i);
		}
	}
	
	
	void printMatrixY(int y[][],int k)
	{
		for(int i=0;i<y[k].length;i++)
		{
			
			System.out.print(y[k][i]+"\t");
		}
		System.out.println("\n");
	}
	
	
	
	void printSum(int c[][])
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String ...s)
	{
		int x[][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					};
		int y[][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					};
		Question10 q = new Question10();
		System.out.println("\n");
		System.out.println("----Matrix 1-----\t\t\t------Matrix 2------\n");
		q.printMatrixXY(x,y);
		q.matrixSum(x,y);
	}
}