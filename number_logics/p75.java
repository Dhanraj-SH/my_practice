import java.util.Scanner;

class p75{

    static void countOddAndEven(int n){
        int even = 0, odd = 0;
        while(n>0){
            if((n%10)%2 == 0) even++;
            else odd++;
            n /= 10;
        }
        System.out.println("Even:"+ even);
        System.out.println("Odd:"+ odd);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        countOddAndEven(n);
    }
}