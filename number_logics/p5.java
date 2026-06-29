import java.util.Scanner;

class p5{

    public static int sum(int n){
        int val = 0;

        while(n>0){
            val = val + (n % 10);
            n /= 10;
        }
        return val;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(sum(n));
    }
}