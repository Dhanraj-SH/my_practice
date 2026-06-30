import java.util.Scanner;

class p22{

    public static boolean checkNeon(int n){
        return n == 9 || n == 1 || n == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkNeon(n)){
            System.out.println("The given number is a Neon number");
        }else{
            System.out.println("Its not a Neon number");
        }
    }
}