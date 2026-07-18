import java.util.Scanner;

class p116{

    static int binaryToDecimal(int n, int power) {
        if (n == 0) return 0;
        return (n % 10) * (int)Math.pow(2, power) + binaryToDecimal(n / 10, power + 1);
    }

    static void decimalToOctal(int n) {
        if (n > 7) decimalToOctal(n / 8);
        System.out.print(n % 8);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int binary = in.nextInt();
        int decimal = binaryToDecimal(binary, 0);
        decimalToOctal(decimal);
    }
}