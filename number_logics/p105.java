import java.util.Scanner;

class p105{
    static boolean checkChar(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(checkChar(ch)){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + " is a consonant");
        }
    }
}