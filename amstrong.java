package array;
import java.util.*;
public class amstrong
{
public static void main(String args[])
{
int n=153,num,sum=0,i;
i=n;
while(n>0)
{
num=n%10;
sum=sum+(num*num*num);
n=n/10;
}
if(i==sum)
{
System.out.println("Armstrong no.");
}
else
{
System.out.println("Not Armstrong no.");
}
}
}

