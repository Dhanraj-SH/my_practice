
class p100 {

    static void hammingNumber() {
        int count = 0;
        int i = 1;
        while(count<20){
            if(i%2==0 || i%3==0 || i%5==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        hammingNumber();
    }
}