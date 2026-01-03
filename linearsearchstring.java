package array;
public class linearsearchstring 
{
 
    public static int num(String numbers[],String key)
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
    String numbers[]={"vaishu","Sakshi","Chaitali"};
    String key="Sakshi";
    int index=num(numbers,key);
    if(index==-1)
    {
        System.out.println("Key not found");
    }
    else
    {
        System.out.println("Key found at index"+index);
    }
    
    
}
}

    

