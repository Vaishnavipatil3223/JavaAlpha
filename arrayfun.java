package array;

public class arrayfun {
    public static void update(int marks[], int nonchangable)
    {
        nonchangable=10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
            
        }

    }
    public static void main(String[] args) {
        int marks[]={98,96,99};
        int nonchangable=5;
        System.out.println(nonchangable);

        update(marks,nonchangable);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    
    }
    
}
