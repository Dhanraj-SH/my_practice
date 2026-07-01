import java.util.Scanner;

class p28{

    static int cube(int n){
        return n * n * n;
    }

    public static boolean checkTrimorphic(int n){
        return (n % 10) == (cube(n) % 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0){
            System.out.println("Enter a vaild number greater than 0");
        }
        if(checkTrimorphic(n)){
            System.out.println("The given number is a Trimorphic number");
        }else{
            System.out.println("Its not a Trimorphic number");
        }
    }
}