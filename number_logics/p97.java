import java.util.Scanner;

class p97{

    static int toPower(int n, int m){
        int result=1;
        for(int i=0;i<m;i++){
             result*= n;
        }
        return result;
    }

    static int countDigit(int n){
        int count=0;
        while (n>0) { 
            n/=10;
            count++;
        }
        return count;
    }


    static void narcissisticNumber(int n) {
        for(int i=1;i<=n;i++){
            int k=i,j=i;
            int count= countDigit(i);
            int r=0;
            while(k>0){
                int rem= k%10;
                k/=10;
                r=r+toPower(rem,count);
            }
            if(r==j){
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        narcissisticNumber(n);
    }
}