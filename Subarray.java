package array;

public class Subarray 
{
    public static void sub(int numbers[])
    {
      
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
            total++;
          
            System.out.println();
        }
        System.out.println();

    }
    System.out.println( "Total subarray is"+total);
  
}
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        sub(numbers);
    }
    
}
