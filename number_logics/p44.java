import java.util.Scanner;

class p44{

    static int count(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count ++;
        }
        return count;
    }

    static int toPower(int n, int m){
        if(n == 0) return 0;
        if(m == 1) return n;
        int val = n;
        for(int i = 1; i < m; i++){
            val *= n;
        }
        return val;
    }

    public static boolean  disariumNumberSeries(int n){
        int power = count(n);
        int val = 0;
        int dupN = n;
        while (dupN>0) { 
            val += toPower(dupN % 10, power--);
            dupN /= 10; 
        }
        return val == n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Start point");
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a valid number greater than 1");
            return;
        }

        System.out.println("End point");
        int m = in.nextInt();
        if(m<n){
            System.out.println("Enter a valid end point greater than n");
            return;
        }
        
        for(int i = n; i<=m; i++){
            if(disariumNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}