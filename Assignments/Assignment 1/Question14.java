/*
count the number of each element
*/
/*
count the number of elements in the array

*/


class Question14
{
	void frequencyCount(int x[],int max)
	{
		int[] counter = new int[max];
		//counter array ki sari value 0 ker do
		for(int i=0;i<max;i++)
			counter[i]=0;
		for (int i = 0; i < x.length; i++) 
		{
			counter[x[i] - 1]++;
		}

		for (int i = 0; i < counter.length; i++)
			System.out.println((i + 1) + " occurs:\t" + counter[i]+"times");
		
	}
	
	int Max(int x[])
	{
		int max=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		return max;
	}
	
	
	public static void main(String ...s)
	{
		int x[] = { 2, 3, 4, 5, 4, 4, 3 };
		Question14 q = new Question14();
		int max = q.Max(x);
		q.frequencyCount(x,max);
	}
}