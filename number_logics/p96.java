import java.util.Scanner;

class p96{

    static int toPower(int n) {
        int res=1;
        for(int i=0;i<n;i++){
            res=res*2;
        }
        return res;
    }

    static int prime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

    static int Mersenne(int n){
        return toPower(n)-1;
    }

    static void mersenneNumber(int n) {
        int i=2; 
        while (n>0) {    
            int z= Mersenne(i);
            int y=prime(z);
                if(y==1){
                    System.out.println(z);
                    n--; 
            }
            i++;  
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        mersenneNumber(n);
    }
}