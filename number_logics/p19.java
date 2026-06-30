import java.util.Scanner;

class p19{

    public static boolean checkAutomorphic(int n){
        return (n % 10) == (n * n) % 10;         
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkAutomorphic(n)){
            System.out.println("The given number is a Automorphic number");
        }else{
            System.out.println("Its not a Automorphic number");
        }
    }
}