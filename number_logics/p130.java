import java.util.Scanner;

class p130{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int num1 = Integer.parseInt(a, 14);
        int num2 = Integer.parseInt(b, 14);
        int sum = num1 + num2;
        System.out.println(Integer.toString(sum, 14).toUpperCase());
    }
}