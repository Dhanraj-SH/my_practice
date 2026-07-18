import java.util.Scanner;

class p114{
    static void decimalToOctal(int n) {
        if (n > 7) {
            decimalToOctal(n / 8);
        }
        System.out.print(n % 8);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        decimalToOctal(n);
    }
}