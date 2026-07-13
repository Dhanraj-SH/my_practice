class p79{

    static int square(int n){
        return n * n;
    }

    static int splitter(int n){
        int count = 0;
        int divider = 1;
        while(n>0){
            n /= 10;
            count++;
        }
        if(count%2 != 0) return 0;
        for(int i = 0; i<count/2; i++){
            divider *= 10;
        }
        return divider;
    }

    static boolean isKaprekarNumber(int n){
        int first = square(n);
        int split = splitter(first);
        if(first<9 && n == first) return true;
        if(split == 0) return false;
        int half = first % split;
        first /= split;
        return first + half == n;
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++){
            if(isKaprekarNumber(i)){
                System.out.println(i);
            }
        }
    }
}