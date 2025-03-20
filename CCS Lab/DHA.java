import java.util.*;
import java.math.*;

public class DHA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the prime no. P: ");
        int p = sc.nextInt();
        System.out.println("Enter the root primitive G: ");
        int g = sc.nextInt();
        System.out.println("Enter the private key of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the private key of B: ");
        int b = sc.nextInt();

        System.out.println("Prime no. p : " + p);
        System.out.println("Root primitive g : " + g);
        System.out.println("Private key A : " + a);
        System.out.println("Private key B : " + b);

        int ya = (int) Math.pow(g, a) % p;
        System.out.println("Public key of A : " + ya);

        int yb = (int) Math.pow(g, b) % p;
        System.out.println("Public key of B : " + yb);

        int sa = (int) Math.pow(yb, a) % p;
        System.out.println("Secret key of A : " + sa);
        int sb = (int) Math.pow(ya, b) % p;
        System.out.println("Secret key of B : " + sb);

    }

}
