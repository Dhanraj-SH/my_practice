import java.util.Scanner;

class p118{

    static int handshakes(int n) {
        return (n*(n-1))/2;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(handshakes(n));
    }
}