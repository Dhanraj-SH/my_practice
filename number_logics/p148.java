import java.util.Scanner;

class p148{

    static int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        int rank = 1;

        for (int i = 0; i < n; i++) {
            int smaller = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) smaller++;
            }
            rank += smaller * fact(n - i - 1);
        }

        System.out.println(rank);
    }
}