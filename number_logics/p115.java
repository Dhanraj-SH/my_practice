import java.util.Scanner;

class p115{

    static int octalToDecimal(int n, int power) {
        if (n == 0) return 0;
        return (n % 10) * (int)Math.pow(8, power) + octalToDecimal(n / 10, power + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(octalToDecimal(n, 0));
    }
}