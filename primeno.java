package function;
 import java.util.*;
public class primeno
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==2)
	{
	System.out.println("Prime no");
	}
	else
	{
	for(int i=2;i<n;i++)
	{
	if(n%i==0)
	{
	System.out.println("Not prime no");
	break;
	}
	else if(n%2!=0)
	{
	System.out.println("prime no");
	}

	}

	}
	} 
}

 