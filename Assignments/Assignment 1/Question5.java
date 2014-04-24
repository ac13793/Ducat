/*
sort the given array in ascending order
*/

class Question5
{
	void sortAscending(int x[])
	{	
		int temp;
		//this loop will sort array in ascending order
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(x[i]<x[j])
				{
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		
		System.out.println("-----------Sorted Array ascending order---------------");
		for(int i=0;i<x.length;i++)
		{
		  System.out.print(x[i]+"\t");
		}
	}
	
	void sortDescending(int x[])
	{
		int temp;
		//this loop will sort array in descending order
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(x[i]>x[j])
				{
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		
		System.out.println("\n\n-----------Sorted Array in descending order---------------");
		for(int i=0;i<x.length;i++)
		{
		  System.out.print(x[i]+"\t");
		}
	}
	
	/*sort 2D array*/
	void sortAscending2D(int y[][])
	{	
		int temp[] = new int[y.length*y.length];
		int k=0;
		//this loop will sort array in ascending order
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				temp[k]=y[i][j];
				k++;
			}
		}
		this.sortAscending(temp);
		
	}
	
	void sortDescending2D(int y[][])
	{	
		int temp[] = new int[y.length*y.length];
		int k=0;
		//this loop will sort array in ascending order
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				temp[k]=y[i][j];
				k++;
			}
		}
		this.sortDescending(temp);
		
	}
	
	
	
	public static void main(String ...s)
	{
		int x[]={4,7,3,9,5,22,10,13,17,};
		int y[][] = {
						{1,9,7},
						{5,4,6},
						{3,8,2}
					};
		Question5 q = new Question5();
		q.sortAscending(x);
		q.sortDescending(x);
		
		q.sortAscending2D(y);
		q.sortDescending2D(y);
		
	}
}