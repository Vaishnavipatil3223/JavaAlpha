
public class typecastexpression {
    public static void main(String[] args) {
        // Rule 1- in type casting expression the byte char short is convert into int 
        byte b=12;
        char c='a';
        short s=5;
        int num=b+c+s;    //byte char not possible 
        System.out.println((int)c);
        System.out.println(num);

        /*Rule 2 
         in expression if we use the float int double datatype the largest size of datatype 
         consist the result in typecasting exprassion
         */
        int a= 10;
        float d= 20.25f;
        double f= 25;
        long l= 30;
        double num2= a+d+f+l;
        System.out.println(num2);


        //it is not proper way but we exexute this
        int w= 10;
        float x= 20.25f;
        double y= 25;
        long z= 30;
        long num3=(long)(w+x+y+z);
        System.out.println(num3);

    }

}
