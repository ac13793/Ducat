/*
print index of maximum row and also print the maximum row
*/
class Question15
{
	void printMaxRow(int x[][])
	{
		int sumRow[] = new int[x.length];
		int maxRow = 0;
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					sumRow[i] = x[i][j];
					
				}
				if(maxRow<sumRow[i])
				maxRow =i;
			}
		System.out.println("Maximum row in the array is ::" + (maxRow+1));
		for(int j=0 ;j<x[maxRow].length ;j++)
		{
			System.out.print(x[maxRow][j]);
		}
		
	}
	
	void printMatrix(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String ...s)
	{
		int x[][] = new int[][]{
								{0,0,0,1,1},
								{0,1,1,1,1},
								{0,0,0,0,1},
								{0,0,0,1,1},
								{0,0,1,1,1}
							 };
		Question15 q = new Question15();
		q.printMatrix(x);
		q.printMaxRow(x);
		
	}
}