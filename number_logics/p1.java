import java.util.Scanner;

public class p1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 0; i <= n; i++){ //forward printing 
            System.out.println(i);
        }

        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }
    }
}