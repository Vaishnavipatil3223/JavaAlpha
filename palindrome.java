package function;

public class palindrome
 {
    public static boolean palindrom(int no)
    {    int n=no;
        int rev=0,lastdigit;
        while(n>0)
        {
        lastdigit=n%10;
        System.out.print(lastdigit);
        rev=rev*10+lastdigit;
        n=n/10;
        }
        if (no ==rev) {
            return true;
            }
            return false;
            }
    
     public static void main(String args[])
     {
        int n=123;
        if(palindrom(n))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        

     }
    }