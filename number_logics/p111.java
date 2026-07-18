import java.util.Scanner;

class p111{
    static void digit(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='0'){
                System.out.print(1);
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        digit(str);
    }
}