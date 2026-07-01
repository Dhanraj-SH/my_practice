import java.util.Scanner;

class p29{

    // normal method
    public static boolean checkEvil(int n){
        int count = 0; 
        while(n>0){
            if((n&1) == 1) count++;
            n = n >> 1;
        }
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0){
            System.out.println("Enter a vaild number greater than 0");
        }
        if(checkEvil(n)){
            System.out.println("The given number is a Evil number");
        }else{
            System.out.println("Its not a Evil number");
        }
    }
}


// brain keringhans method
    // public static boolean checkEvil(int n){
    //     int count = 0; 
    //     while(n>0){
    //         n = (n & (n-1));
    //         count++; 
    //     }
    //     return n % 2 == 0;
    // }