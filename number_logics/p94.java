import java.math.BigInteger;
import java.util.Scanner;

class p94{

    static BigInteger fermat(long n) {
        BigInteger exp = BigInteger.TWO.pow((int) n);
        BigInteger res = BigInteger.TWO.pow(exp.intValue());
        return res.add(BigInteger.ONE);
    }

    static void fermatNumber(long n) {
        for (long i = 0; i < n; i++) {
            System.out.println(fermat(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        fermatNumber(n);
    }
}