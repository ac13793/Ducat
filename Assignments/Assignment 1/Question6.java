/*
merge sort
*/
class Question6
{	
	void mergeSort(int x[], int y[])
	{
		int len = x.length + y.length;
		int z[] = new int[len];	
		//System.out.println("Length is ::"+len);
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			z[i] = x[i];
			count++;
			
		}

		for(int j=count,k=0;j<len;j++,k++)
		{
				z[j] = y[k];
				//System.out.println(z[count]);
		}
		
		System.out.println("----------Array Before sorted-----------------\n\n");
		
		for(int j=0;j<z.length;j++)
		{
				
				System.out.print(z[j]+"\t");
		}
		
		System.out.println("\n\n");
		sortAscending(z);
		printZ(z);
		sortDescending(z);
		printZ(z);
	}
	
	
	void printZ(int z[])
	{
		
		for(int i=0;i<z.length;i++)
		{
		  System.out.print(z[i]+"\t");
		}
		System.out.println("\n\n");
	}
	
	void sortAscending(int z[])
	{	
		int temp;
		//this loop will sort array in ascending order
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(z[i]<z[j])
				{
					temp=z[j];
					z[j]=z[i];
					z[i]=temp;
				}
			}
		}
		System.out.println("-----------Sorted Array ascending order---------------\n\n");
		
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
		
		System.out.println("\n\n-----------Sorted Array in descending order---------------\n\n");
		
	}
	
	public static void main(String ...s)
	{
		int x[]={4,7,3,9,5,22,10,13,17,};
		int y[]={0,7,33,22,54,12,19,24};?
		
		Question6 q = new Question6();
		q.mergeSort(x,y);
		
	}
}

 