package function;

public class dectobinary 
{
    public static void decobin(int n)
    {
         int dec=n;
        int pow=0;
        int binary=0;
        while(n>0)
        {
            int rem=n%2;
           
            binary=binary+(rem *(int)Math.pow(10,pow));
            pow++;  
            n=n/2;
              }
              System.out.println("decimal number of the binary"+dec+"="+binary);
       
    }
    public static void main(String[] args) {
        decobin(7);
    }
    
}

