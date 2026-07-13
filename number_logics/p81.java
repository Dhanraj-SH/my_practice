class p81 {

    static int toPower(int n, int m){
        if(n == 0) return 0;
        else if(m == 0) return 1;
        else if(m == 1) return n;
        
        int power = n;
        for(int i = 1; i<m; i++){
            power *= n;
        }
        return power;
    }

    static int countNumber(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }

    static int isNarcissisticNumber(int n){
        int count = countNumber(n);
        int add = 0;
        while(n>0){
            add += toPower(n%10, count);
            n /= 10;
        }
        return add;
    }

    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        while(count < 15){
            if (isNarcissisticNumber(i) == i){
                count++;
                System.out.println(i);
            }
            i++;
        }
    }
}