import java.util.Scanner;

class p13{

    public static boolean checkSquare(int n){
        int square = 1;
        int numberIncrement = 1;
        while(square<n){
            square = numberIncrement * numberIncrement;
            numberIncrement++;
        }
        return square == n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1){
            System.out.println("Enter a vaild number greater than 1");
        }
        if(checkSquare(n)){
            System.out.println("The given number is a perfect square number");
        }else{
            System.out.println("Its not a perfect square number");
        }
    }
}