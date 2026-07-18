import java.util.Scanner;

class p125{

    static int countWays(String s, int n) {
        if (n == 0 || n == 1) return 1;
        if (s.charAt(s.length() - n) == '0') return 0;

        int count = countWays(s, n - 1);
        if (Integer.parseInt(s.substring(s.length() - n, s.length() - n + 2)) <= 26) {
            count += countWays(s, n - 2);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Possible Decodings = " + countWays(s, s.length()));
    }
}