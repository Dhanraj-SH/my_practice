import java.util.Scanner;

class p38{

    static int sqaure(int n){
        return n * n;
    }

    public static boolean  automorphicNumberSeries(int n){
        return (n % 10) == sqaure(n) % 10;
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
            if(automorphicNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}