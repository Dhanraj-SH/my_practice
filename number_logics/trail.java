import java.util.Scanner;

class trail{

    static boolean nextPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    static boolean uglyNumber(int n){
        int factor = 2;
        while(n>0 && factor<6){
            int presentPrime = factor;
            if(n%factor==0){
                n = n/factor;
            }else{
                if(nextPrime(n) && n != presentPrime){
                    factor = n;
                }else{
                    n++;
                }
            }
        }
        return n == 1;
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