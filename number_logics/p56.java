import java.util.Scanner;

class p56{

    static int sqaure(int n){
        return  n * n;
    }

    public static boolean automorphicNumberSeries(int n){
        return n % 10 == sqaure(n) % 10;
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
            if(automorphicNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}