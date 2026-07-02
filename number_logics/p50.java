import java.util.Scanner;

class p50{

    static int square(int n){
        return n * n;
    }

    public static boolean  perfectSquareNumberSeries(int n){
        if(n == 1)return true;
        int numberIncrement = 1;
        while(square(numberIncrement)<=n){
            if(square(numberIncrement) == n) return true; 
            numberIncrement++;
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
            if(perfectSquareNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}