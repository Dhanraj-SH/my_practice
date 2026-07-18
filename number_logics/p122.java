import java.util.Scanner;

class p122{
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int occupySeats(int n, int m){
        return factorial(n) / factorial(n - m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(occupySeats(n,m));
    }
}