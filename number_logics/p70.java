import java.util.Scanner;

class p70{

    static int largestNumber(int n){
        int max = 0;
        while(n>0){
            int temp = n%10;
            if(temp == 9) return temp;
            if(max<temp) max = temp;
            n /= 10;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(largestNumber(n));
    }
}