import java.util.Scanner;

class p95{

    static int cube(int x) {
        return x * x * x;
    }

    static void ramanujanNumber(int x) {
        int num = 1;
        while (num <= x) {
            int a = 1, count = 0;
            while (cube(a) < num) {
                int b = a;
                while (cube(a) + cube(b) <= num) {
                    if (cube(a) + cube(b) == num) {
                        count++;
                    }
                    b++;
                }
                a++;
            }
            if (count > 1) {
                System.out.println(num);
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ramanujanNumber(n);
    }
}