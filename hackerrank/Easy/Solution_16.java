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
//      * Complete the 'isAnagram' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. STRING s
//      *  2. STRING t
//      */

//     public static int isAnagram(String s, String t) {

//         int n = s.length();
//         int m = t.length();

//         if (n != m) {
//             return 0;
//         }

//         int sArr[] = new int[26];
//         int tArr[] = new int[26];

//         for (int i = 0; i < n; i++) {
//             sArr[s.charAt(i) - 'a']++;
//             tArr[t.charAt(i) - 'a']++;
//         }

//         for (int i = 0; i < 26; i++) {
//             if (sArr[i] != tArr[i]) {
//                 return 0;
//             }
//         }

//         return 1;
//     }

// }

// public class Solution_16 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         String s = bufferedReader.readLine();

//         String t = bufferedReader.readLine();

//         int result = Result.isAnagram(s, t);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
