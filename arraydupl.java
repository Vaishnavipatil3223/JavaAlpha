package array;

public class arraydupl
{
    public static void dupl(int arr[])
    {
        boolean var=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    var=true;
                }
                else if(arr[i]!=arr[j])
                {
                    var=false;
                }
            }
            
        }
        System.out.println(var);

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        dupl(arr);
    }
    
}
