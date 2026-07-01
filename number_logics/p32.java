import java.util.Scanner;

class p32{

    public static boolean checkPrefectSquare(int n){
        int square = 0;
        int numberIncrement = 1;
        while(square<n){
            square = numberIncrement * numberIncrement;
            numberIncrement ++;
        }
        return square == n;
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
            if(checkPrefectSquare(i)){
                System.out.print(i + ",");
            }
        }        
    }
}