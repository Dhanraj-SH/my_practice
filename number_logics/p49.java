import java.util.Scanner;

class p49{

    public static boolean  primeNumberSeries(int n){
        for(int i=2; i*i<=n; i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("End point");
        int n = in.nextInt();
        if(n<=1){
            System.out.println("Enter a valid number greater than 1");
            return;
        }
        
        for(int i = 2; i<=n; i++){
            if(primeNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}