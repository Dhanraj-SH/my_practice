import java.util.Scanner;

class p146{

    static boolean divisibleBy7(int n) {
        n = Math.abs(n);
        if (n == 0 || n == 7) return true;
        if (n < 10) return false;
        return divisibleBy7(n / 10 - 2 * (n % 10));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (divisibleBy7(n)) System.out.println("Divisible");
        else System.out.println("Not Divisible");
    }
}