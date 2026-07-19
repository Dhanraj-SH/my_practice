import java.util.Scanner;

class p134{

    static int multiply(int n, int m) {
        if (m == 0) return 0;
        return n + multiply(n, m - 1);
    }

    static int power(int n, int m) {
        if (m == 0) return 1;
        return multiply(n, power(n, m - 1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(power(n, m));
    }
}