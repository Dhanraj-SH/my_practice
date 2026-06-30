import java.util.Scanner;

class p23{

    static int sum(int n){
        int val = 0;
        while(n>0){
            val += n % 10;
            n /= 10;
        }
        return val;
    }

    static int multiply(int n){
        int val = 1;
        while(n>0){
            val *= n % 10;
            n /= 10;
        }
        return val;
    }

    public static boolean checkSpy(int n){
        return sum(n) == multiply(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkSpy(n)){
            System.out.println("The given number is a Spy number");
        }else{
            System.out.println("Its not a Spy number");
        }
    }
}