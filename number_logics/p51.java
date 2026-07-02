import java.util.Scanner;

class p51{

    static int countDigit(int n){
        int count = 0;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }

    static int toPower(int n, int m){
        if(m == 1) return n;
        if(m == 0) return 0;
        int val = n;
        for(int i = 1; i<m; i++){
            val *= n;
        }
        return val;
    }

    public static boolean  armstrongNumberSeries(int n){
        int count = countDigit(n);
        int val = 0;
        int dupN = n;
        while(dupN>0){
            val += toPower(dupN % 10, count); 
            dupN /= 10;
        }
        return val == n;
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
            if(armstrongNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}