package function;

public class digitsum {
    public static void digit (int n)
    {
        int sum=0,digit;
        do{
      
         digit=n%10;
        sum=sum+digit;
    
        n=n/10;
        }while(n>0);
        System.out.println(sum);
    }
    public static void main(String[] args) {
      digit(53);  
    }
    
}
