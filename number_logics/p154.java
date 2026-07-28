import java.util.*;

class p154{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int n = in.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int x = in.nextInt();
            if (r.nextInt(i) == 0) result = x;
        }

        System.out.println(result);
    }
}