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
//      * Complete the 'countInstallationSequences' function below.
//      *
//      * The function is expected to return a STRING.
//      * The function accepts INTEGER n as parameter.
//      */

//     public static String countInstallationSequences(int n) {
//     // Write your code here
//         if(n<=1) return "1";
        
//         BigInteger dp[] = new BigInteger[n+1];
        
//         dp[0] = BigInteger.ONE;
//         dp[1] = BigInteger.ONE;
        
//         for(int i = 2; i<=n; i++){
//             dp[i] = dp[i-1].add(dp[i-2]);
//         }
        
//         return dp[n].toString();
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         String result = Result.countInstallationSequences(n);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }