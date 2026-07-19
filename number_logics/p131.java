import java.util.Scanner;

class p131{
    static double babylonianMethod(double n, double x){
        double avg = (x + n / x)/2;
        if(Math.abs(avg-x)<0.00000000001) return x;
        return babylonianMethod(n, avg);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        System.out.println(babylonianMethod(n, 2.0));
    }
}