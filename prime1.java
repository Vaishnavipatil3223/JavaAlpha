package function;

 import java.util.*;
class prime1
{
public static void main(String args[])
{
    int flag=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n==2)
{
System.out.println("prime no");
}
else
{
for(int i=2;i<n;i++)
{
if(n%i==0)
{
flag=1;
}

}
if(flag==1)
{
System.out.println("not prime no");
}
else 
{
    System.out.println(" prime no");    
}
}
}
}


 
