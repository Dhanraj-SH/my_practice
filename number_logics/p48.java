import java.util.Scanner;

class p48{

    static int revNum(int n){
        int val = 0;
        while(n>0){
            val = (val*10) + (n % 10);
            n /= 10;
        }
        return val;
    }

    public static boolean  palindromeNumberSeries(int n){
        return n == revNum(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("End point");
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a valid number greater than 1");
            return;
        }
        
        for(int i = 1; i<=n; i++){
            if(palindromeNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}