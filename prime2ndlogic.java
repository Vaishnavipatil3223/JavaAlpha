import java.util.*;

public class prime2ndlogic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;   // assume prime at start

        if (n <= 1) {
            flag = 1;   // not prime
        } else if (n == 2) {
            flag = 0;   // prime
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;  // not prime
                    break;     // stop once divisor found
                }
            }
        }

        if (flag == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
