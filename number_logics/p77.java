
class p77{

    static int numberClassifier(int n){
        int add = 0;
        for(int i = 1; i <= n/2; i++){
            if(n%i==0) add += i;
        }
        return add;
    }

    public static void main(String[] args) {
        int perfectCount = 0;
        int deficientCount = 0;
        int abundantCount = 0;
        for(int i =1; i<=10000; i++){
            if(numberClassifier(i) == i){
                perfectCount++;
            }else if(numberClassifier(i) > i){
                abundantCount++;
            }else if(numberClassifier(i) < i){
                deficientCount++;
            }
        }
        System.out.println("Perfect Number:"+ perfectCount);
        System.out.println("Abundant Number:"+ abundantCount);
        System.out.println("Deficient Number:"+ deficientCount);
    }
}