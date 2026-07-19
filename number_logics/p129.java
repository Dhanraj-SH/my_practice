import java.util.Scanner;

class p129{

    static boolean luckyNumber(int n, int step) {
        if(step>n) return true;
        if(n%step==0) return false;
        n = n - (n/step);
        return luckyNumber(n, ++step);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(luckyNumber(n, 2)){
            System.out.println("The number is a lucky number");
        }
        else{
            System.out.println("The number is not a lucky number");
        }
    }
}