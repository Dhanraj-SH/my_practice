import java.util.Scanner;

class p62{

    static int count(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }

    static int toPower(int n, int m){
        if(n == 0) return 0;
        if(m == 1) return m;
        int val = n;
        for (int i = 1; i < m; i++) {
            val *= n;
        }
        return val;
    }

    public static int disariumNumberSeries(int n){
        int position = count(n);
        int val = 0;
        while(n>0){
            val += toPower(n % 10, position--);
            n /= 10;
        }
        return val; 
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
            if(disariumNumberSeries(i) == i){
                System.out.print(i + ",");
            }
        }        
    }
}