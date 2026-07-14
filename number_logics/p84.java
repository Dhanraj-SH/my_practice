
class p84{

    static int square(int n){
        return n * n;
    }

    static boolean happyNumber(int n){
        do{
            int ans = 0;
            while(n>0){
                ans += square(n%10);
                n /= 10;
            }
            n = ans;
        }while(n>9);
        return n == 1;
    }

    public static void main(String[] args)
    {
        int count = 0;
        int i = 1;
        while(count<10){
            if(happyNumber(i)){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}