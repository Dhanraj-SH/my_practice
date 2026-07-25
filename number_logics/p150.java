import java.util.Random;
import java.util.Scanner;

class p150{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        Random r = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}