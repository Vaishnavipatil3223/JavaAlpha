import java.util.*;
public class gst {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the pen pencil eraser cost");
    float pen=sc.nextFloat();
    float pencil=sc.nextFloat();
    float eraser=sc.nextFloat();
    float price=pen+pencil+eraser;
    System.out.println(price);
    double total=price+(price*0.18);
    System.out.println(total);

}
}
