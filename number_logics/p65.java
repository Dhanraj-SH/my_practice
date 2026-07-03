import java.util.Scanner;

class p65{

    public static boolean evilNumberSeries(int n){
        int count = 0;
        while(n>0){
            if(n%2==1) count ++;
            n /= 2;
        }
        return count % 2 == 0;
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
            if(evilNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}