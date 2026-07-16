import java.util.Scanner;

class p98{

    static void pell(int n){
        int a=0;
        int b=1;
        int p;
        System.out.println(a);
        System.out.println(b);
        while(n>1){
            p=(2*b)+a;
            System.out.println(p);
            a=b;
            b=p;
            n--;
        }
    }
    static void pellNumber(int n){
        switch(n) {
            case 0 -> System.out.println(n);
            case 1 -> {
                System.out.println(n-1);
                System.out.println(n);
            }
            default -> pell(n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pellNumber(n);
    }
}