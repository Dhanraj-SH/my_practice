import java.util.Scanner;

class p110{

    public static int checkFriendly(int n){
        int i =1;
        int val = 0;
        while(i<=n){
            if(n%i == 0){
                val += i;

            }
        }
        return  val/n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkFriendly(n) == checkFriendly(m)){
            System.out.println("The given number is a Friendly pair");
        }else{
            System.out.println("Its not a Friendly pair");
        }
    }
}