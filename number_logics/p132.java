import java.util.Scanner;

class p132{
    static int mulNumber(int n, int m){
        if(m == 1) return n;
        return n + mulNumber(n, --m); 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(mulNumber(n, m));
    }
}