import java.util.Scanner;

class p93{

    static  int toPower(int n){
        int res=1;
        while(n>0){
            res=res*10;
            n--;
        }
        return res;
    }
    static int countDigit(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    static int rotateNum(int n, int power) {
        int rem = n % 10;
        n = (rem * power) + (n / 10);
        return n;
    }

    static boolean cyclicNumber(int n){
        int count = countDigit(n);
        int power = toPower(count - 1);
        int y = n;
        int m = 1;

        while (m <= count) {
            int mul = y * m;
            int rotate = y;
            int count1 = 0;

            for (int i = 0; i < count; i++) {
                rotate = rotateNum(rotate, power);
                if (rotate == mul) {
                    count1 = 1;
                    break;
                }
            }
            if (count1 == 0) {
                return false; 
            }
            m++;
        }
        return true; 
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(cyclicNumber(n)){
            System.out.println("The number is a cyclic number");
        }else{
            System.out.println("The number is not a cyclic number");
        }
    }
}