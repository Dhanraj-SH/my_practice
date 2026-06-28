import java.util.Scanner;

public class p2{

    public static int compute(int n){
        if(n<0){
            return 0;
        }
        else if (n<=1){
            return 1;
        }

        int val = 1;
        while(n>=2){
            val *= n;
            n--;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.printf("%.10f%n",1.0 /compute(n));
    }
}