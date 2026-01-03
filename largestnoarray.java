package array;

public class largestnoarray 
{
    public static int Largest(int numbers[])
    {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i])
            {
                largest=numbers[i];
            }
            if(smallest>numbers[i])
            {
                smallest=numbers[i];
            }
         
        }
        System.out.println("Smallest is"+smallest);
        return largest;
        
    }
    public static void main(String[] args) 
    {
        int numbers[]={1,3,4,6,8,2};
        System.out.println("Largest is"+Largest(numbers));
        
    }
    
}
