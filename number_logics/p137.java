import java.util.Scanner;

class p137{

    static boolean contains3(int n) {
        while (n > 0) {
            if (n % 10 == 3) return true;
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!contains3(i)) count++;
        }
        System.out.println(count);
    }
}