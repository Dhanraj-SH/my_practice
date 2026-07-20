import java.util.Scanner;

class p136{

    static Scanner in = new Scanner(java.util.Objects.requireNonNull(System.in));

    static void avgStream(int n){
        double avg = 0;

        for (int i = 1; i <= n; i++) {
            int num = in.nextInt();
            avg = avg + (num - avg) / (double)i;
            System.out.printf("%.2f\n", avg);
        }
    }

    public static void main(String[] args) {
        int n = in.nextInt(); 
        avgStream(n);
    }
}