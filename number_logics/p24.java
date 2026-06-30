import java.util.Scanner;

class p24{

    static int square(int n){
        return n * n;
    }

    public static boolean checkHappy(int n){
        do{
            int val = 0;
            while(n>0){
                val += square(n % 10);
                n /= 10;
            }
            n = val;
        }while(n>9);
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        else if(n>1 && n<=9){
            System.out.println("Its not a Happy number");
        }
        if(checkHappy(n) || n == 1){
            System.out.println("The given number is a Happy number");
        }else{
            System.out.println("Its not a Happy number");
        }
    }
}