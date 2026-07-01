import java.util.Scanner;

class p39{

    public static boolean  magicNumberSeries(int n){
        do{
            int val = 0;
            while(n>0){
                val += n % 10;
                n /= 10;
            }
            n = val;
        }while(n>9);
        return n == 1;
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
            if(magicNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}