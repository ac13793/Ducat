class Question13
{
	void shift(int x[])
	{
		
		this.sortAscending(x);
	}
	
	
	void sortAscending(int x[])
	{	
		int temp;
		//this loop will sort array in ascending order
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(x[i]<x[j]&&(x[i]>0)&&(x[j]>0))
				{
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
				else if(x[i]>x[j]&&(x[i]<0)&&(x[j]<0))
				{
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		
		System.out.println("\n-----Sorted Array of both positive and negative value in ascending order----\n");
		for(int i=0;i<x.length;i++)
		{
		  System.out.print(x[i]+"\t");
		}
	}
	
	public static void main(String ...s)
	{
		int x[] = new int[]{-3,-2,-5,-1,-4,4,6,3,8,1};
		Question13 q = new Question13();
		q.shift(x);
	}
}