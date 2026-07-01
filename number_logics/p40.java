import java.util.Scanner;

class p40{

    public static boolean  neonNumberSeries(int n){
        return  n == 0 || n == 1 || n == 9; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Start point");
        int n = in.nextInt();
        if(n<-1){
            System.out.println("Enter a valid number greater than 0");
            return;
        }
        System.out.println("End point");
        int m = in.nextInt();
        if(m<n){
            System.out.println("Enter a valid end point greater than n");
            return;
        }
        if(n>10){
            return;
        }
        if(n>-1 || m < 10){    
            for(int i = n; i<=m; i++){
                if(neonNumberSeries(i)){
                    System.out.print(i + ",");
                }
                if(n>9){
                    return;
                }
            }        
        }
    }
}