import java.util.Scanner;

class p55{

    public static boolean abundantNumberSeries(int n){
        int val = 1;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                val += i;
            }
        }
        return val > n;
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
            if(abundantNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}