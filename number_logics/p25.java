import java.util.Scanner;

class p25{

    static int square(int n){
        return n * n;
    }

    public static boolean checkSunny(int n){
        int val = 1;
        while(val <= n/2 && square(val) <= n){
            if(square(val) == n) return true;
            val++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkSunny(n+1)){
            System.out.println("The given number is a Sunny number");
        }else{
            System.out.println("Its not a Sunny number");
        }
    }
}