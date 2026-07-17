import java.util.Scanner;

class p106{
    static boolean checkChar(char ch) {
        int asciiValue = (int)(ch);
        return (asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 120);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(checkChar(ch)){
            System.out.println(ch + " is a alphabet");
        }else{
            System.out.println(ch + " is not a alphabet");
        }
    }
}