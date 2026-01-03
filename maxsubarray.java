package array;
public class maxsubarray 
{
    public static void sub(int numbers[])
    {
        int max=Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<numbers.length;i++)
        {
       
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
            int end=j;
            int sum=0;
          
            for(int k=start;k<=end;k++)
            {   
                
                System.out.print(numbers[k]+" ");
                sum=sum+numbers[k];
                
            
            }

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
    
