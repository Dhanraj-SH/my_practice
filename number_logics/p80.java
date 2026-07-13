class p80 {

    static long reverse(long n) {
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    static boolean isLychrel(long n) {
        for (int i = 0; i < 500; i++) {
            long rev = reverse(n);
            if (Long.MAX_VALUE - n < rev) return true;
            n += rev;
            if (isPalindrome(n))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (isLychrel(i))
                System.out.println(i);
        }
    }
}