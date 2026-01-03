import java.util.*;
public class calculator8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum;
        System.out.println("Enter choice");
        char ch=sc.next().charAt(0);
        System.out.println("Result is");
        switch(ch)
        {
        case 'a':
        sum=a+b;
        System.out.println(sum);
        break;
        case 'b':
        sum=a-b;
        System.out.println(sum);
        break;
        case 'c':
        
        System.out.println(a*b);
        break;
        case 'd':
        sum=a/b;
        System.out.println(sum);
        break;
        case 'e':
        sum=a%b;
        System.out.println(sum);
        break;
        default:
        System.out.println("no operation available");
        }
    }
    
}
