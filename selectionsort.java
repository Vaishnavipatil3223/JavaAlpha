package sorting;

public class selectionsort
{
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                   

                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;


        }

    }
   public static void printarr(int arr[])
   {
            for(int k=0;k<arr.length;k++)
            {
                System.out.println(arr[k]);
            }
   }
    public static void main(String args[])
    {
        int arr[]={5,6,3,2,4,1,0};
        selection(arr);
        printarr(arr);
        
    }
    
}
