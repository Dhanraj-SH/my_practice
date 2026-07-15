import java.util.Scanner;

class p92{

    static int cube(int n){
        return n * n * n;
    }

    static boolean cubeNumber(int n){
        int i = 1;
        if(n == 1)return true;
        int check = cube(i);
        while(i<n/2 && check<n){
            if(check == n) return true;
            i++;
            check = cube(i);
        }
        return check == n;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(cubeNumber(n)){
            System.out.println("The number is a cube number");
        }else{
            System.out.println("The number is not a cube number");
        }
    }
}