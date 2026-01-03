package function;
import java.util.*;
public class ex1 {
    

public static void main (String args[])
{
int n=251025,sum=0,rem;
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("Sum is"+sum);
}
}

 


