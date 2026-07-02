import java.util.Scanner;

class p58{

    public static boolean neonNumberSeries(int n){
        return n == 0 || n == 1 || n == 9;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("End point");
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a valid number greater than 1");
            return;
        }
        if(n>9){
            return;
        }
        
        for(int i = 1; i<=n; i++){
            if(neonNumberSeries(i)){
                System.out.print(i + ",");
            }
            if(i>9){
                return;
            }
        }        
    }
}