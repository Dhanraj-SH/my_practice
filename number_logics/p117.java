import java.util.Scanner;

class p117{

    static int octalToDecimal(int n, int power) {
        if (n == 0) return 0;
        return (n % 10) * (int)Math.pow(8, power) + octalToDecimal(n / 10, power + 1);
    }

    static void decimalToBinary(int n) {
        if (n > 1) decimalToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int octal = in.nextInt();
        int decimal = octalToDecimal(octal, 0);
        decimalToBinary(decimal);
    }
}