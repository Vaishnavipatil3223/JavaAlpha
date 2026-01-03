public class reversedno
 {
    public static void main(String[] args) {

    int num=10899;
    int rev=0,lastdigit;
    while(num>0)
    {
        lastdigit=num%10;
        rev=rev*10+lastdigit;
        num=num/10;
    }
    System.out.print(rev);
}   
}
