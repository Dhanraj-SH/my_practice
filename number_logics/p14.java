import java.util.Scanner;

class p14{

    static int countDigit(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count ++;
        }
        return count;    
    }

    static int toPower(int n, int m){
        if(n<=1){
            return n;
        }
        int powerNumber = n;
        for(int i = 1; i < m; i++){
            powerNumber *= n;
        }
        return powerNumber;
    }

    public static boolean checkArmstrong(int n){
        int count = countDigit(n);
        int val = 0;
        int dupN = n;
        while(n > 0){
            val = val + toPower(n % 10, count);
            n /= 10;
        }
        return dupN == val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0){
            System.out.println("Enter a vaild number greater than 0");
        }
        if(checkArmstrong(n)){
            System.out.println("The given number is a Armstrong number");
        }else{
            System.out.println("Its not a Armstrong number");
        }
    }
}