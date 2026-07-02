import java.util.Scanner;

class p60{

    public static boolean happyNumberSeries(int n){
        if(n == 1) return true;
        if(n>1 && n<10) return false;
        do{
            int val = 0;
            while(n>0){
                val += n % 10;
                n /= 10;
            }
            n = val;
        }while(n > 9);
        return n == 1;
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
            if(happyNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}