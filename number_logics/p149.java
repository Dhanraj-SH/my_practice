import java.util.Scanner;
import java.util.TreeSet;

class p149{

    static void permute(String str, String ans, TreeSet<String> set) {
        if (str.length() == 0) {
            set.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            permute(rem, ans + ch, set);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        String s = in.next();

        permute(s, "", set);

        for (String x : set){
            System.out.println(x);
        }
    }
}