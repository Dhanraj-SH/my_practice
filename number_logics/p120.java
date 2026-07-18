import java.util.Scanner;

class p120{
    static String[] words = { "Zero", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine"};

    static void numberToWords(int n) {
        if (n == 0) return;
        numberToWords(n / 10);
        System.out.print(words[n % 10] + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0)System.out.println("Zero");
        else numberToWords(n);
    }
}