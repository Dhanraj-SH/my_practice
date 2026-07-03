import java.util.Scanner;

class p68{

    static int countSetandUnset(int n){
        int set = 0;
        int unset = 0;
        while(n>0){
            if(n%2==1) set++;
            n /= 2;
            unset++;
        }
        System.out.println("Set bit:"+ set);
        return unset - set;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println("Unset:" + countSetandUnset(n));
    }
}