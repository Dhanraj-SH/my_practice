import java.util.*;

class p152{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        Random r = new Random();
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            if (r.nextInt(i + 1) == 0) result = arr[i];
        }

        System.out.println(result);
    }
}