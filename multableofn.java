package assignment9;
import java.util.*;
public class multableofn 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result;
        for(int i=1;i<=10;i++)
        {
            result=n*i;
            System.out.println(n+"*"+i+"="+result);

        }
    }
    
}
