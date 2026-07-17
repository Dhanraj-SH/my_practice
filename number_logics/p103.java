import java.util.Scanner;

class p103{
    static int sumDigit(int n) {
        return n>0 ? n % 10 + sumDigit(n/10) : 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumDigit(n));
    }
}