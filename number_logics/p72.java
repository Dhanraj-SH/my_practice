import java.util.Scanner;

class p72{

    static int dividedSum(int n){
        int val = 1;
        for(int i = 2; i<=n/2; i++){
            if(n%i==0){
                val += i;
            }
        }
        return val;
    }

    static boolean amicablePairs(int n, int m){
        return dividedSum(n) == m && dividedSum(m) == n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        if(amicablePairs(n, m)){
            System.out.println("They are amicable pairs");
        }else{
            System.out.println("They are not amicable pairs");
        }
    }
}