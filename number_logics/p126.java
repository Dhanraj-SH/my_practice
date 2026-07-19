import java.util.Scanner;

class p126{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%3!=0 || n<=2) System.out.println("Its not a multiple of 3");
        else System.out.println("Its Multiple of 3");
    }
}