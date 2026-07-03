import java.util.Scanner;

class p66{

    static int revNumber(int val, int n){
        return n > 0 ? revNumber(val*10 + (n % 10), n / 10) :val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(revNumber(0,n));
    }
}