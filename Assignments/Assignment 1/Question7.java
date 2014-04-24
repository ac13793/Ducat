/*
union of two array
for that first combine both the array and remove common elements
*/

class Question7
{

	void intersection(int x[],int y[])
	{
		int inter[] = new int[x.length+y.length];
		int k=0,intercount=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					inter[k++]=x[i];
					intercount++;
				}
			}
		}
		System.out.println("************Intersection of two array************\n");
		for(int i=0;i<intercount;i++)
		{
			System.out.print(inter[i]+" ");
		}
		System.out.println();
		this.union(x,y,inter,intercount);
	}
	
	void union(int x[],int y[],int inter[],int interCount)	//interCount common elements ki length hai
	{
		int total[] = new int[x.length + y.length];
		//first we insert all the elements of x and y in the total array
		for(int i=0;i<x.length;i++)
		{
			total[i] = x[i];
		}
		for(int j=x.length,k=0;j<total.length;j++,k++)
		{
			total[j] = y[k];
		}
		System.out.println("*********Total elements***************\n");
		for(int i=0;i<total.length;i++)
		{
			System.out.print(total[i] + " ");
		}
		//after that remove common elements from the total elements
		//int union[] = new int[total.length-inter.length-1];
		
		int union[] = new int[x.length+y.length-interCount ];
		int rcount=0,r=0,p=0;
		for(int i=0;i<total.length;i++)
		{
			if(total[i]!=inter[p])
				{
					//System.out.println("!"+inter[p]);
					union[r++]=total[i];
					rcount++;
					//p++;
				}
				else
				p++;
		}
		System.out.println("\n********Union of two array*************");
		for(int i=0;i<union.length;i++)
		{
			System.out.print(union[i] + " " );
		}
		System.out.println("\n********Union inacsending order*************");
		sortAscending(union);
	}
	
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
		
		for(int i=0;i<x.length;i++)
		{
		  System.out.print(x[i]+"\t");
		}
	}
	
	public static void main(String ...s)
	{
		int x[] = {1, 3, 4, 5, 7};
		int y[] = {2, 3, 5, 6};
		
		Question7 q = new Question7();
		System.out.print("Elements in array x::\t");
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
		System.out.print("\nElements in array y:\t");
		for(int i=0;i<y.length;i++)
			System.out.print(y[i]+" ");
		System.out.println("\n");
		q.intersection(x,y);
		
		
	}
}




