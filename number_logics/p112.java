import java.util.Scanner;

class p112{

    static int toPower(int n, int m){
        if(m==0) return 1;
        else if(m == 1) return n;
        for(int i = 1; i < m; i++){
            n *= 2;
        }
        return n;
    }

    static void converstion(int n){
        int val = 0;
        int power = 0;
        while(n>0){
            if(n%10==1) val += toPower(2, power);
            power++;
            n /= 10;
        }
        System.out.println(val);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        converstion(n);
    }
}