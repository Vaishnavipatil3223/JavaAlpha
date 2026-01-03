package array;

public class maxsubarray2 
{
    public static void sub(int numbers[])
    {
        int sum=0;
        int prefix[]=new int[numbers.length];
        int max=Integer.MIN_VALUE;
        int total=0;
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++ )
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
       
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
            int end=j;
        
            sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
           


            System.out.println("Sum is"+sum);
            if(max<=sum)
                {
                    max=sum;
                }
            
            total++;
          
            System.out.println();
        }
        System.out.println();

    }
    System.out.println( "Total subarray is"+total);
    System.out.println("maximum sum is"+max);
  
}
    public static void main(String args[])
    {
        int numbers[]={1,-2,6,-1,3};
        sub(numbers);
    }
    
}
    


