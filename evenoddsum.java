package assignment9;

public class evenoddsum 
{
    public static void main(String[] args)
     {
        int n=100;
        int sum=0,add=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            else
            {
                 add=add+i;
            }
              
        }
        System.out.println("even no sum is"+sum);
        System.out.println("odd no sum is"+add);
    }
    
}
