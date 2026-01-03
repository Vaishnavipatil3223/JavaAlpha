package function;

public class primefun
 {
    public static boolean prime (int n)
    {
        //boolean isprime=true;
        if(n==2)
        {
           return true; //return isprime;
        }
        
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                   return false; //isprime=false;
                   
                }

    
            }
            return true;
        }
        public static void primerange(int n)
        {
        for(int i=1;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.println(i+" ");
            }
  
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        primerange(16);
    }
}
    

