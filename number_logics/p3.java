import java.util.Scanner;

class p3{
    
    public static int compute(int n) {
        if(n<0){
            return 0;
        }
        else if(n<=0){
            return 1;
        }

        int val = 1;
        while(n>=2){
            val *= n;
            n--; 
        }
        return val;
    }

    public static float toPower(int x , int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return x;
        }
        int val = x;
        for(int i = 2; i<=n; i++){
            val *= x;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter x");
        int x = in.nextInt();
        System.out.println("Enter n");
        int n = in.nextInt();

        System.out.printf("%.10f%n", toPower(x, n)/compute(n));
    }
}