import java.util.Scanner;

class p47{

    public static boolean  evilNumberSeries(int n){
        int count = 0;
        while(n>0){
            if(n%2==1) count ++;
            n /= 2;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Start point");
        int n = in.nextInt();
        if(n<0){
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
            if(evilNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}