package function;
public class callbyvalue
 {
    public static void swap(int a,int b )
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) 
    {    int a=10;
        int b=12;
        swap(a,b); //call by value means copy of varaibles like a and b is define in function as formal parameters and in main method it is define arguments;
       
        
    }
    
}
