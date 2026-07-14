import java.util.Scanner;

class p90{

    static int amicableNumber(int n){
        int sum = 1;
        for(int i = 2; i<=n/2; i++){
            if(n%i==0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(amicableNumber(n) == m && amicableNumber(m) == n ){
            System.out.println("The number is a amicable number");
        }else{
            System.out.println("The number is not a amicable number");
        }
    }
}