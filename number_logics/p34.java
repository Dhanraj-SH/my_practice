import java.util.Scanner;

class p34{

    static int fact(int n){
        if(n == 1 || n == 0) return 1;
        int val = 1;
        while(n>1){
            val *= n;
            n--;
        }
        return val;
    }

    public static int strongSeries(int n){
        int val = 0;
        while(n>0){
            val += fact(n%10);
            n /= 10;  
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Start point");
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a valid number greater than 0");
            return;
        }
        System.out.println("End point");
        int m = in.nextInt();
        if(m<n){
            System.out.println("Enter a valid end point greater than n");
            return;
        }
        for(int i = n; i<=m; i++){
            if(strongSeries(i) == i){
                System.out.print(i + ",");
            }
        }        
    }
}