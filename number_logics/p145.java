import java.util.Random;

class p145{
    static Random r = new Random();

    static int biasedCoin() {
        return r.nextDouble() < 0.7 ? 1 : 0;
    }

    static int fairCoin() {
        while (true) {
            int a = biasedCoin();
            int b = biasedCoin();
            if (a != b) return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(fairCoin());
    }
}