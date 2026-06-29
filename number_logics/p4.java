import java.util.Scanner;

class p4{

    public static int count(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(count(n));
    }
}