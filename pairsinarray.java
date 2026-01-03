package array;
public class pairsinarray 
{
    public static void pairsarr(int numbers[])
    {
        int total=0;
        for(int i=0;i<numbers.length;i++)
        {
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++)
            {
                System.out.println("("+current+","+numbers[j]+" )");
                 total++;

            }
            System.out.println();
        }
        System.out.println("total pairs is"+total);  // n(n-1)/2

    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        pairsarr(numbers);
    }
    
}
