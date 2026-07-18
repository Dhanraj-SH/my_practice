import java.util.Scanner;

class p113{
    static void decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        decimalToBinary(n);
    }
}