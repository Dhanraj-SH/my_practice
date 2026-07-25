import java.util.Scanner;

class p147{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int sum = 0;

        for (char c : num.toCharArray()){
            sum += c - '0';
        }

        if (sum % 3 == 0) System.out.println(num);
        else System.out.println("No multiple of 3");
    }
}