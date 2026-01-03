public class productusingfun
 {
    public static int product(int a,int b)
    {
        int prod=a*b;
         return prod;
    }
    public static void main(String[] args)
     {
        int a=10;
        int b=20;
       int pro= product(a,b);
       System.out.println("a*b="+pro);
       pro = product(5,10);
       System.out.println("a*b="+pro);


        
    }
    
}
