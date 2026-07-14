import java.util.Scanner;

class p85{

    static int square(int n){
        return n * n;
    }

    static boolean happyNumber(int n){
        do{
            int ans = 0;
            while(n>0){
                ans += square(n%10);
                n /= 10;
            }
            n = ans;
        }while(n>9);
        return n == 1;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(!happyNumber(n)){
            System.out.println("The number is a unhappy number");
        }else{
            System.out.println("The number is a happy number");
        }
    }
}