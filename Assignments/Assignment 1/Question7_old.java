/*
find union of two array into the another array
*/

class Question7
{	
	void union(int z[])
	{
		int len =z.length;
		int u[] = new int[len];
		System.out.println("\n length"+len);
		//int count=0;
		
		for(int i=0,k=0;i<z.length;i++,k++)
		{
			//u[k]=z[i];
			
				if(z[i]==z[i+1])
				{
					i++;
				}
				else
				{
					u[k]=z[i];
				}
		}
		
		
		System.out.println("\n****** Union of two Array ********\n");
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+"\t");
		}
	}
	
	
	void mergeSort(int x[], int y[])
	{
		int len = x.length + y.length;
		int z[] = new int[len];	
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			z[i] = x[i];
			count++;
		}

		for(int j=count,k=0;j<len;j++,k++)
		{
				z[j] = y[k];
		}
		
		//System.out.println("\n\n");
		sortAscending(z);
		
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
		this.union(z);
	}
	
	
	
	
	void printXY(int x[] ,int y[])
	{
		System.out.print("Array x ::\t");
		for(int i=0;i<x.length;i++)
		{
			
			System.out.print(x[i]+"\t");
		}
		System.out.print("\n\nArray y ::\t");
		for(int j=0;j<y.length;j++)
		{
			System.out.print(y[j]+"\t");
		}
	}
	
	public static void main(String ...s)
	{
		int x[]={4,7,3,9,5,22,10,13,17};
		int y[]={0,7,33,22,54,12,19,24};
		Question7 q = new Question7();
		q.printXY(x,y);
		q.mergeSort(x,y);
		//q.union(x,y);
	}
	
}


public class union {
    public static void main(String[] args) {
    }
    public int[] getIntersection(int[] arrayOne, int arrayTwo){
         int[] array1= {1,2,3};
         int[] array2={3,4,5};
            for(int i=0; i < array1.length; i++){
                for(int t=0; t < array2.length; t++){
                    if ( array1[i] == array2[t]){
                    }  
                }
            }
            return array1;
        }
    public void getUnion(int[]arrayOne, int[] arrayTwo){
       int[] array1 = {1,2,3};
       int[] array2 = {3,4,5};
        for(int i=0; i < array1.length; i++){
            for(int t=0; t < array2.length; t++){
            }
         } 
     }
  }


