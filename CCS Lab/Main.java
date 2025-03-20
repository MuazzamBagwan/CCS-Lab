import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st prime no. p :");
        int p = sc.nextInt();
        System.out.println("Enter 1st prime no. q :");
        int q = sc.nextInt();
        System.out.println("Enter msg m:");
        int m = sc.nextInt();
        int n = p * q;
        int e = 7;
        int d;
        int c = 0;

        int phi = ((p - 1) * (q - 1));
        System.out.println("Value of n :" + n);
        System.out.println("Value of phi :" + phi);

        for (int i = 1; i <= 9; i++) {
            int x = ((phi * i) + 1);

            if (x % e == 0) {
                d = x / e;
                break;

            }
        }
        System.out.println("value of d :" + d);

        c = (int) (Math.pow(m, e) % n);
        System.out.println("Value of c :" + c);

        m = (int) (Math.pow(c, d) % n);
        System.out.println("Value of m :" + m);

    }

}
