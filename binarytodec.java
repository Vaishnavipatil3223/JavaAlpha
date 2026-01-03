package function;

public class binarytodec 
{
    public static void bintodec(int binarynum)
    {
        int mynum=binarynum;
        int pow=0;
        int dec=0;
        while(binarynum>0)
        {
            int lastdigit=binarynum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            binarynum=binarynum/10;
            pow++;


        }
        System.err.println("The decimal of binary number"+mynum+"="+dec);
    }
    public static void main(String[] args) 
    {
        bintodec(111);
        
    }
    
}
