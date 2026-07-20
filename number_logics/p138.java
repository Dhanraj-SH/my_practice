import java.util.Scanner;

class p138{

    static Scanner in = new Scanner(System.in);

    static void magicSquare(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[0][j];
        }

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum != sum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += arr[i][j];
            }
            if (colSum != sum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }

        int d1 = 0;
        for (int i = 0; i < n; i++) {
            d1 += arr[i][i];
        }

        int d2 = 0;
        for (int i = 0; i < n; i++) {
            d2 += arr[i][n - 1 - i];
        }

        if (d1 == sum && d2 == sum) System.out.println("Its a magic Square");
        else System.out.println("Not a Magic Square");
    }

    public static void main(String[] args) {
        int n = in.nextInt();
        magicSquare(n);
    }
}