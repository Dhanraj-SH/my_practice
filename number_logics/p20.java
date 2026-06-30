import java.util.Scanner;

class p20{

    public static boolean checkMagic(int n){
        do{
            int val = 0;
            while(n>0){
                val += (n % 10);
                n /= 10;
            }
            n = val;
        }while(n>9);
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkMagic(n)){
            System.out.println("The given number is a Magic number");
        }else{
            System.out.println("Its not a Magic number");
        }
    }
}