import java.util.Scanner;

class p135{

    static boolean  checkfibnacci(int n, int f1, int f2) {
        int val = f1 + f2;
        if(val > n) return false;
        if(val == n) return true;
        return checkfibnacci(n, f2, val);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(checkfibnacci(n, 0, 1)) System.out.println("It is a fibonacci number");
        else System.out.println("It is not a fibonacci number");
    }
}