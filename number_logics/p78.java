import java.util.Random;
import java.util.Scanner;

class p78{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(rand.nextInt(n, m));

    }
}