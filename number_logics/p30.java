import java.util.Scanner;

class p30{

    public static int revNum(int n){
        int rev = 0;
        while(n>0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
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
            if(i == revNum(i)){
                System.out.print(i + ",");
            }
        }        
    }
}