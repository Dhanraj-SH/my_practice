import java.util.Scanner;

class p45{

    public static boolean  pronicNumberSeries(int n){
        int i = 1;
        while(i <= n/2){
            if(i*(i+1) == n) return true;
            i++;
        }
        return false;
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
            if(pronicNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}