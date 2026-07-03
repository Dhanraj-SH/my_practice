import java.util.Scanner;

class p64{

    static int cube(int n){
        return n * n * n;
    }

    public static boolean trimorphicNumberSeries(int n){
        return (n % 10) == cube(n) % 10;
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
            if(trimorphicNumberSeries(i)){
                System.out.print(i + ",");
            }
        }        
    }
}