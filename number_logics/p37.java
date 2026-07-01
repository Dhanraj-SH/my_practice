import java.util.Scanner;

class p37{

    public static int abundantNumberSeries(int n){
        int val = 1;
        for(int i = 2; i<= n/2; i++){
            if(n%i == 0){
                val += i; 
            }
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
            if(abundantNumberSeries(i)>i){
                System.out.print(i + ",");
            }
        }        
    }
}