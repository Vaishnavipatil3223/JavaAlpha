package array;

public class reversearr 
{
   public static void reverse(int numbers[])
   {
    int start=0,last=numbers.length-1;
    while(start<last)
    {
        int temp=numbers[start];
        numbers[start]=numbers[last];
        numbers[last]=temp;

          start++;
          last--;
    }
    
   } 
   public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};
    reverse(numbers);
    for(int i=0;i<numbers.length;i++)
    {
        System.out.print(numbers[i]+" ");
    }
    
   }
}
