import java.util.Scanner;

class p11{

    public static int revNum(int n){
        int rev = 0;
        while(n>0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n == revNum(n)){
            System.out.println("The given number is a palindrome number");
        }else{
            System.out.println("Its not a palindrome number");
        }
    }
}