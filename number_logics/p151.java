import java.util.Scanner;

class p151{

    static int nCr(int n, int r) {
        if (r>n-r) r=n-r;

        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println(nCr(n, r));
    }
}