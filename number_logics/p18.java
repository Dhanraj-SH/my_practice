import java.util.Scanner;

class p18{

    public static boolean checkAbundant(int n){
        int val = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                val += i;
            }
        }
        return n < val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0){
            System.out.println("Enter a vaild number greater than 0");
        }
        if(checkAbundant(n)){
            System.out.println("The given number is a Abundant number");
        }else{
            System.out.println("Its not a Abundant number");
        }
    }
}