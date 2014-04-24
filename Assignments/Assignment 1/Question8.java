/*
intersection of two array
*/

class Question8
{

	void intersection(int x[],int y[])
	{
		int inter[] = new int[x.length+y.length];
		int k=0,count=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					inter[k++]=x[i];
					count++;
				}
			}
		}
		System.out.println("************Intersection of two array************\n");
		for(int i=0;i<count;i++)
		{
			System.out.print(inter[i]+" ");
		}
		System.out.println();
	}
	public static void main(String ...s)
	{
		int x[] = {1, 3, 4, 5, 7};
		int y[] = {2, 3, 5, 6};
		Question8 q = new Question8();
		q.intersection(x,y);
	}
}