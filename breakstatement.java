public class breakstatement {
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<=6;i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Exit from the loop");
    }
}
