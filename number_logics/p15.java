import java.util.Scanner;

class p15{

    static int fact(int n){
        int val = 1;
        while(n>=2){
            val *= n--;
        }
        return val;
    }

    public static boolean checkStrong(int n){
        int val = 0;
        int dupN = n;
        while(n > 0){
            val = val + fact(n % 10);
            n /= 10;
        }
        return dupN == val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkStrong(n)){
            System.out.println("The given number is a Strong number");
        }else{
            System.out.println("Its not a Strong number");
        }
    }
}