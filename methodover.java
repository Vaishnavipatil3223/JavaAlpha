package function;
class A 
{
      void disp(int a,int b)
     {  
         System.out.println(a+b);
        System.out.println("Hello");
     }
}
 class B extends A
{
     void disp(int a,int b)
    {   super.disp(3,4);
        System.out.println(a-b);
        System.out.println("Hello");
    }
}
public class methodover
{



    public static void main(String[] args) {
        B obj=new B();
        obj.disp(3,2);
    }
}

