package sorting;

public class bubblesort 
{
    public static void sort(int arr[])
    {
        int swap=0;
        for(int t=0;t<arr.length-1;t++)
        {
            
            for(int j=0;j<arr.length-1-t;j++)
            {
        
                if(arr[j]>arr[j+1])
                {
               
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
                }

            }
           
        }
        System.out.println(swap);

    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        
      
    }
    public static void main(String args[])
    {
        int arr[]={3,4,1,5,2};
        sort(arr);
        printarr(arr);             //Complexity= O(n2)
    }
    
}
