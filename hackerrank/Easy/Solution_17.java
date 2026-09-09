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
//      * Complete the 'minTasksToCancelForNoConflict' function below.
//      *
//      * The function is expected to return a STRING_ARRAY.
//      * The function accepts STRING digits as parameter.
//      */

//     public static List<String> minTasksToCancelForNoConflict(String digits) {
//     // Write your code here
    
//         List<String> result = new ArrayList<>();
        
//         if(digits == null ||digits.length() == 0) return result;
        
//         String[] phone = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
//         combinations(digits, 0, new StringBuilder(), result, phone);
        
//         return result;
//     }
    
//     public static void combinations(String digits, int i, StringBuilder generator,List<String> result, String[] phone){
//         if(i == digits.length()){
//             result.add(generator.toString());
//             return;
//         }
        
//         String letters = phone[digits.charAt(i) - '0'];
        
//         for(int j = 0; j<letters.length(); j++){
//             generator.append(letters.charAt(j));
//             combinations(digits, i+1, generator, result, phone);
//             generator.deleteCharAt(generator.length()-1);
//         }
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         String digits = bufferedReader.readLine();

//         List<String> result = Result.minTasksToCancelForNoConflict(digits);

//         System.out.println(
//             result.stream()
//                 .collect(joining("\n"))
//         );

//         bufferedReader.close();
//     }
// }
