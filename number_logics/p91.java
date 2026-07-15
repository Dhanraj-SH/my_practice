import java.util.Scanner;

class p91{

    static int countDigit(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }

    static int multiple(int n){
        int mul = 1;
        for(int i = 1; i<n; i++){
            mul *= 10;
        }
        return mul;
    }

    static boolean circularPrime(int n){
        int count = countDigit(n);
        int mul = multiple(count);
        while(count>1){
            for(int i = 2; i*i<n; i++){
                if(n%i==0) return false;
                
            }
            n = ((n%10)* mul)+ n / 10;
            count--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(circularPrime(n)){
            System.out.println("The number is a circular prime number");
        }else{
            System.out.println("The number is not a circular prime number");
        }
    }
}