import java.util.Scanner;

class p123{

    static boolean  nineDivisior(int n){
        int count = 1;
        for(int i = 0; i <= n/2; i++){
            if(n%i==0) count++;
        }
        return count == 9;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(nineDivisior(n)) System.out.println("Yes its has nine divisor");
        else System.out.println("No it doesnt have 9 divisor");
    }
}