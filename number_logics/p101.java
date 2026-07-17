import java.util.Scanner;

class p101{
    static void swapNumber(int a, int b) {
        System.out.println("a:"+ a +"  b:"+ b);
        b = (a + b) - (a = b);
        System.out.println("a:"+ a +"  b:"+ b);
        a = a ^ b ^ (b = a);
        System.out.println("a:"+ a +"  b:"+ b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        swapNumber(a, b);
    }
}