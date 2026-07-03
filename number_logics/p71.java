import java.util.Scanner;

class p71{

    static int smallestNumber(int n){
        int min = 9;
        while(n>0){
            int temp = n%10;
            if(temp == 0) return temp;
            if(min>temp) min = temp;
            n /= 10;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(smallestNumber(n));
    }
}