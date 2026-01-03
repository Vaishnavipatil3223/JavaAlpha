package array;
public class linearsearch
 {
    public static int num(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i]==key)
            {
                return i;
            }

        }
        return -1;
    }
    
public static void main(String[] args) 
{
    int numbers[]={2,3,4,5,10,20};
    int key=20;
    int index=num(numbers,key);
    if(index==-1)
    {
        System.out.println("Key not found");
    }
    else
    {
        System.out.println("Key found at index"+index);               //complexity=O(n)
    }                           
    
    
}
}
