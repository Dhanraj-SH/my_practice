import java.util.Scanner;

class p99{

    static int countDigit(int n){
        int count = 0;
        while(n>0){
            count++;
            n /=10;
        }
        return count;
    }

    static int sumDigit(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean keithNumber(int n) {

        int original = n;
        int digits = countDigit(n);


        int arr[] = new int[digits];
        int temp = n;

        for (int i = digits - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        while (true) {

            int sum = sumDigit(arr);
            if (sum == original) return true;
            if (sum > original) return false;

            for (int i = 0; i < digits - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[digits - 1] = sum;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (keithNumber(n))
            System.out.println("The number is a Keith number");
        else
            System.out.println("The number is not a Keith number");
    }
}