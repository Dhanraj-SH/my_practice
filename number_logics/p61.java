import java.util.Scanner;

class trail{

    static int square(int n){
        return n * n;
    }

    public static boolean sunnyNumberSeries(int n){
        if(n == 0) return true;
        int val = 1;
        while(val <= n/2 && square(val)<= n){
            if(square(val) == n) return true;
            val ++;
        }
        return false;
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
            if(sunnyNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}