import java.util.Scanner;

class p124{

    static double quadraticEquation(double a, double b, double c){
       return b * b - 4 * a * c;
    }

    static void quadraticRoots(double a, double b, double c){

        double cal = quadraticEquation(a, b, c);
        
        if (cal > 0) {
            double r1 = (-b + Math.sqrt(cal)) / (2 * a);
            double r2 = (-b - Math.sqrt(cal)) / (2 * a);
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (cal == 0) {
            double r = -b / (2 * a);
            System.out.println("Both roots are equal");
            System.out.println("Root = " + r);
        } else {
            System.out.println("Imaginary roots");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        quadraticRoots(a, b, c);
    }
}