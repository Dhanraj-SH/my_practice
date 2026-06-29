import java.util.Scanner;

class p10{

    public static boolean  Prime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void primeFactor(int n){

        if (n <= 1) {
            System.out.println("No prime factors for numbers less than 2.");
            return;
        }
        
        int factor = 2;
        while (n > 1) { 
            if (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            } else {
                factor++;
                if (Prime(n)) {
                    System.out.print(n);
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        primeFactor(n);

    }
}