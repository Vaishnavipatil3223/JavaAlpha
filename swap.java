package function;

public class swap {

    public static void swop(int a, int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) 
    {
        int a=10;
        int b=20;
        swop(a,b);
    }
    
}
