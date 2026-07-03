import java.util.Scanner;

class p74{

    static int smallestNumber(int n){
        if(n<10) return n;

        int first = 9;
        int second = 9;

        while (n > 0) {
            int temp = n % 10;
            if (temp < first) {
                second = first;
                first = temp;
            } else if (temp < second && temp > first) {
                second = temp;
            } else if (temp == first && second == 9) {
                 second = temp;
            }
            n /= 10;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(smallestNumber(n));
    }
}