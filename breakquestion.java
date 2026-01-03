import java.util.*;
public class breakquestion 
{
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);


do
{
    int num=sc.nextInt();
    
    if(num%10==0)
    {
        break;
    }
System.out.println("Number is"+num);
  
}while(true);
}   
}
