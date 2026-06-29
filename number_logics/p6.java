import java.util.Scanner;

class p6{

    public static int revDigit(int n){
        int val = 0;

        while(n>0){
            val = (val * 10) + (n % 10);
            n /= 10;
        }
        return val;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(revDigit(n));
    }
}