import java.util.Scanner;

class p143{

    static boolean palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        do {
            n++;
        } while (!palindrome(n));
        System.out.println(n);
    }
}