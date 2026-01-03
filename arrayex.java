package array;

public class arrayex
{
	public static void main(String args[])
	{
		int total=0;
		int arraylist[]={2,3,4,5,6,7};
		System.out.println("Array elemts are:");
	 	for(int i=0;i<arraylist.length;i++)
	 	{
	 	    
			System.out.println(arraylist[i]);
			total+=arraylist[i];
		}
		System.out.println("Total is:"+total);
		int max=arraylist[0];
		for(int i=1;i<arraylist.length;i++)
		{
			if(max<arraylist[i])
			{
				max=arraylist[i];
			}

		}
		System.out.println("Maximum array element is"+max);
		int min=arraylist[0];
		for(int i=1;i<arraylist.length;i++)
		{
			if(min>arraylist[i])
			{
				min=arraylist[i];
			}

		}

		System.out.println("Minimum array element is"+min);
		//swapping of array elemsts
        System.out.println("After swapping Array elemts are:");
        int n=arraylist.length;
		for(int i=0;i<n/2;i++)
		{ 

		
				
					int temp;
                    temp=arraylist[i];
					arraylist[i]=arraylist[n-1-i];
					arraylist[n-1-i]=temp;
				}
		
		
	 	for(int i=0;i<arraylist.length;i++)
	 	{
	 	    
			System.out.println(arraylist[i]);
		
		}
	}
}

	
		
	
 
