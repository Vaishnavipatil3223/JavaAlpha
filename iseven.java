package function;

public class iseven
 {
    public static boolean even(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int n=13;
        System.out.println(even(n));
    }
    
}
