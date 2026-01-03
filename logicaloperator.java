public class logicaloperator
 {
    public static void main(String[] args) 
    {

        int a=10;
        int b=5;
        //Logical And
        System.out.println((6>3)&&(2>0));
        System.out.println((3>6)&&(2<0));
        System.out.println((a>b)&&(b<a));
        System.out.println((a<b)&&(b>a));

        //logical OR
        System.out.println((3>5)||(5==5));
        System.out.println((a>b)||(b<a));
        System.out.println((a<b)||(b>a));
        System.out.println((a>b)||(b>a));
       
        //Logical Not
        System.out.println(!(a>b));
        System.out.println(!(a<b));
        System.out.println(!(3==0));

    }
    
}
