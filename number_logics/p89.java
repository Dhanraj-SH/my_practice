import java.util.Scanner;

class p89{

    static boolean duckNumber(String n){
        if(n.charAt(0) == '-' || n.charAt(0) == '0' || n.length() == 1) return false;
        for(int i = 1; i<n.length(); i++){
            if(n.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        if(duckNumber(n)){
            System.out.println("The number is a duck number");
        }else{
            System.out.println("The number is not a duck number");
        }
    }
}