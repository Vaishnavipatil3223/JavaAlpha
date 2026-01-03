package array;
import java.util.*;


public class array1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int [20];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        int percent=((marks[0]+marks[1]+marks[2])/3);
        System.out.println(percent);
        System.out.println("Length"+marks.length);
      sc.close();
        
    }
    
}
