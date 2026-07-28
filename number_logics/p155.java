import java.util.Scanner;

class p155{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        while (n > 0) {
            if (n % 2 == 0 && n % 3 == 0 && n % 5 == 0) {
                System.out.println(n);
                return;
            }
            n--;
        }
    }
}