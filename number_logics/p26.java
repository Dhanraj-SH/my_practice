import java.util.Scanner;

class p26{

    static int toPower(int n, int m){
        if(m == 1) return n;
        if(n == 0) return 1;
        int val = n;
        for(int i = 1; i<m; i++){
            val *= n;
        }
        return val;
    }

    static int countDigit(int n){
        int count = 0;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean checkDisarium(int n){
        int digitPosition = countDigit(n);
        int dupN = n, val = 0;
        while(dupN>0){
            val += toPower(dupN % 10, digitPosition--); 
            dupN /= 10;
        }
        return n == val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkDisarium(n)){
            System.out.println("The given number is a Disarium number");
        }else{
            System.out.println("Its not a Disarium number");
        }
    }
}