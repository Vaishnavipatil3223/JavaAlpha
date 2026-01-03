import java.util.*;
public class continueque  
{
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
   
   
   do
   {
       int num=sc.nextInt();
       
       if(num%10==0)
       {
           continue;
       }
   System.out.println("Number is"+num);
     
   }while(true);
     
   }
}
