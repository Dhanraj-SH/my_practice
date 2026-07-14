import java.util.Scanner;

class p87{

    public static boolean checkHarshad(int n){
        int val = 0;
        int dupN = n;
        while(dupN>0){
            val += dupN%10;
            dupN /= 10; 
        }
        return n % val == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0){
            System.out.println("Enter a vaild number greater than 0");
        }
        if(checkHarshad(n)){
            System.out.println("The given number is a Harshad number");
        }else{
            System.out.println("Its not a Harshad number");
        }
    }
}