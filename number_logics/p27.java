import java.util.Scanner;

class p27{

    public static boolean checkPronic(int n){
        int i = 1;
        while(i<=n/2){
            if((i*(i+1)) == n)return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0){
            System.out.println("Enter a vaild number greater than 0");
        }
        if(checkPronic(n) || n == 0 || n == 2){
            System.out.println("The given number is a Pronic number");
        }else{
            System.out.println("Its not a Pronic number");
        }
    }
}