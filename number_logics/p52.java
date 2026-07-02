import java.util.Scanner;

class p52{

    static int fact(int n){
        if(n<=1) return 1;
        int val = 1;
        for(int i = 2; i<=n; i++){
            val *= i;
        }
        return val;
    }

    public static boolean strongNumberSeries(int n){
        int val = 0;
        int dupN = n;
        while(dupN>0){
            val += fact(dupN % 10); 
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
            if(strongNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}