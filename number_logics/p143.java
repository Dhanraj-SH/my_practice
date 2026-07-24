import java.util.Scanner;

class trail {

    static boolean divisibleBy3(String binary) {
        int state = 0;
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            switch (state) {
                case 0 -> state = (ch == '0') ? 0 : 1;
                case 1 -> state = (ch == '0') ? 2 : 0;
                case 2 -> state = (ch == '0') ? 1 : 2;
            }
        }
        return state == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String binary = in.next();
        if (divisibleBy3(binary)){
            System.out.println("Divisible by 3");
        }
        else{
            System.out.println("Not Divisible by 3");
        }
    }
}