import java.util.Scanner;

class p69{

    static int sum(int a, int b){
        int carry;
        while(b!=0){
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(sum(n, m));
    }
}