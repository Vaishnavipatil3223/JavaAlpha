package starpattern;

public class hollowrectangle
 {
    public static void hollow(int noofrow , int noofcol)
    {
        for(int i=1;i<=noofrow;i++)
        {
            for(int j=1;j<=noofcol;j++)
            {
            if(i==1 || i==noofrow || j==1 || j==noofcol)
            {
                System.out.print("*");
            
            }
            else
            {
                System.out.print(" "); 
            }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow(4,5);
    }
    
}
