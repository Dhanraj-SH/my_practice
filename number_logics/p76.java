import java.util.Scanner;

class p76{

    static boolean uglyNumber(int n){
        return n%2==0 || n%3==0 || n%5==0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter number greater then 0");
        }
        if(uglyNumber(n)||n==1){
            System.out.println("The number is a ugly number");
        }else{
            System.out.println("The number is not a ugly number");
        }
    }
}