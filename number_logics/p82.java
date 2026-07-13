class p82 {

    public static void main(String[] args) {
        int n = 2;
        int m = 1;
        System.out.println(n);
        System.out.println(m);
        for(int i = 2; i < 10; i++){
            int temp = n;
            n = m;
            m = temp + m;
            System.out.println(m);
        }
    }
}