/*
print all the diagonal from left to right
*/
class Question16
{

	void dPrint(int x[][])
	{
		int k=x.length;
		for(int i=0;i<x.length;i++)
		{
			k=i+1;
			System.out.print("Diagonal "+(i+1)+" ::\t");
			for(int j=0;j<=i;j++)
			{
				if(i>=j)
				{
				k=k-1;
				System.out.print(x[k][j]+"\t");
				}
				else
				{
				k=k-1;
				System.out.print(x[j][k]+"\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int len=x.length-1;
		int p=x.length;
		for(int i=0,r=1;i<x.length;i++,r++)
		{
			System.out.print("Diagonal "+(++p)+" ::\t");//
			for(int j=x.length-1,q=r;j>=i;j--,q++)
			{
				
				//System.out.print(j+" "+q+ "\t");
				System.out.print(x[j][q]+"\t");
				
			}
			
			System.out.println();
		}
		
		/*
	void dPrint(int x[][])
	{
		int a=x.length;
		int k=0;
		for(int i1=0;i1<8;i1++)
		{

			for(int i=0;i<a;i++)
			{
			for(int j=0;j<x[0].length;j++)
			{
			if((i+j)==k)
			System.out.print(x[i][j]+"\t");
				
			}
			System.out.println();
		}
		k++;
		System.out.println();
		}
		
	}
	*/
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
									{1,2,3,4,5},
									{6,7,8,9,10},
									{11,12,13,14,15},
									{16,17,18,19,20}
							   };
		Question16 q = new Question16();
		System.out.println("*************Matrix*************");
		q.printMatrix(x);
		q.dPrint(x);
	}
}
