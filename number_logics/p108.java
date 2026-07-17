import java.util.Scanner;

class p108{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        int n = (int)(ch);
        if(n>=65 && n<=90) System.out.println("Uppercase");
        else if(n>=97 && n<=120) System.out.println("Lowercase");
        else if(n>=33 && n<=47) System.out.println("Special Character");
        else System.out.println("Invalid");
    }
}