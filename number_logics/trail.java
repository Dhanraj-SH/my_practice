import java.util.Scanner;

class trail {

    static void maxPrimeFactors(int n, int m) {

        int[] factorCount = new int[m + 1];

        for (int i = 2; i <= m; i++) {
            if (factorCount[i] == 0) {
                for (int j = i; j <= m; j += i) {
                    factorCount[j]++;
                }
            }
        }

        int max = 0;
        int ans = n;

        for (int i = n; i <= m; i++) {
            if (factorCount[i] > max) {
                max = factorCount[i];
                ans = i;
            }
        }

        System.out.println(ans);
        System.out.println("Distinct Prime Factors = " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        maxPrimeFactors(n, m);
    }
}