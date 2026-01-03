package function;
//Binomial coeficiant using factorial method
public class factfunction 
{
    public static int fact1(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int binomial(int n,int r)
    {
        int a=fact1(n);
        int b=fact1(r);
        int c=fact1(n-r);
        int result= a/(b*c);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
    }
}