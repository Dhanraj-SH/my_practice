// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;



// class Result {

//     /*
//      * Complete the 'getAutoSaveInterval' function below.
//      *
//      * The function is expected to return a LONG_INTEGER.
//      * The function accepts INTEGER n as parameter.
//      */

//     public static long getAutoSaveInterval(int n) {
//     // Write your code here
//         if(n == 0) return 1;
//         if(n == 1) return 2;
        
//         long[] dp = new long[n+1];
        
//         dp[0] = 1;
//         dp[1] = 2;
        
//         for(int i = 2; i<=n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
        
//         return dp[n];
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         long result = Result.getAutoSaveInterval(n);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }