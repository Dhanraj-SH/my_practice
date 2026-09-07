// import java.io.*;
// import java.util.*;
// import static java.util.stream.Collectors.joining;



// class Result {

//     /*
//      * Complete the 'generateAngleBracketSequences' function below.
//      *
//      * The function is expected to return a STRING_ARRAY.
//      * The function accepts INTEGER n as parameter.
//      */

//     public static List<String> generateAngleBracketSequences(int n) {
//     // Write your code here
//         List<String> sequence = new ArrayList<>();
//         sequenceGenrator(n, 0, 0, new StringBuilder(), sequence);
//         return sequence;
//     }
    
//     public static void sequenceGenrator(int n, int open, int close, StringBuilder current, List<String> sequence){
//         if(open == n && close == n){
//             sequence.add(current.toString());
//             return;
//         }
        
//         if(open < n){
//             current.append('<');
//             sequenceGenrator(n, open + 1, close, current, sequence);
//             current.deleteCharAt(current.length()-1);
//         }
        
//         if(close < open){
//             current.append('>');
//             sequenceGenrator(n, open, close + 1, current, sequence);
//             current.deleteCharAt(current.length() - 1);
//         }
//     }
    
// }

// public class Solution_13 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         List<String> result = Result.generateAngleBracketSequences(n);

//         System.out.println(
//             result.stream()
//                 .collect(joining("\n"))
//         );

//         bufferedReader.close();
//     }
// }
