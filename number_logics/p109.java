import java.util.Scanner;

class p109{
    static double areaOfCircle(int n){
        return Math.PI * (n * n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(areaOfCircle(n));
    }
}