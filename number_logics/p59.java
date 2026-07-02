import java.util.Scanner;

class p59{

    static int sum(int n){
        int val = 0;
        while(n>0){
            val += n % 10;
            n /= 10;
        }
        return val; 
    }

    static int multiple(int n){
        int val = 1;
        while(n>0){
            val *= n % 10;
            n /= 10;
        }
        return val; 
    }

    public static boolean spyNumberSeries(int n){
        return sum(n) == multiple(n);
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
            if(spyNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}