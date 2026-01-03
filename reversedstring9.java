import java.util.*;

public class reversedstring9 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(); //to handle spaces in string 
        String reverse=" ";
        int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
           
        }
        System.out.println("Reversed string"+reverse);
    }
    
}
