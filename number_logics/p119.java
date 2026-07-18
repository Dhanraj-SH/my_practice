import java.util.Scanner;

public class p119{

    static void coordinates(double x, double y){
        if (x > 0 && y > 0) System.out.println("Quadrant I");
        else if (x < 0 && y > 0) System.out.println("Quadrant II");
        else if (x < 0 && y < 0) System.out.println("Quadrant III");
        else if (x > 0 && y < 0) System.out.println("Quadrant IV");
        else if (x == 0 && y == 0) System.out.println("Origin");
        else if (x == 0) System.out.println("Y-axis");
        else System.out.println("X-axis");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        coordinates(x, y);
    }
}
