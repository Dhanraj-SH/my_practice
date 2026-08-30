import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            boolean flag = true;
            for(int i = 2; i <= n; i++){
                if(n%i==0){
                    if(i%10 == 2 || i%10 == 7){
                        flag = false;
                        System.out.print(i+" ");
                    }
                }
            }
            if(flag) System.out.print("-1");
        }
    }
}



class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        for (int i = 1; i < n; i++) {
            stones[i] += stones[i - 1];
        }
        int best = stones[n - 1];
        for (int i = n - 2; i >= 1; i--) {
            best = Math.max(
                best,
                stones[i] - best
            );
        }
        return best;
    }
}