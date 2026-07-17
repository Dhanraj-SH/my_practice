import java.util.Scanner;

class p102{
    static int toPower(int n, int m) {
        if(n == 0) return 0;
        else if(m == 1) return n;
        else if(m == 0) return 1;
        return n * toPower(n, --m);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(toPower(n, m));
    }
}