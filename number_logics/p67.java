import java.util.Scanner;

class p67{

    static int genericRoot(int n){
        do{
            int val = 0;
            while(n>0){
                val += n%10;
                n /= 10;
            }
            n = val;
        }while(n>9);
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(genericRoot(n));
    }
}