import java.util.Scanner;

class trail{

    public static int fact(int n){
        int val = 1;
        
        if(n == 1 || n == 0){
            return 1;
        } 

        while(n>0){
            val *= n;
            n--;
        }
        return val;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n<0){
            System.out.println("Enter a valid number greater then or equal to zero");
        }
        System.out.println(fact(n));
    }
}