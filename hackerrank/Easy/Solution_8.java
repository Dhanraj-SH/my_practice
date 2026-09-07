package Easy;
// import java.io.*;
// import java.util.*;



// class Result {

//     /*
//      * Complete the 'areBracketsProperlyMatched' function below.
//      *
//      * The function is expected to return a BOOLEAN.
//      * The function accepts STRING code_snippet as parameter.
//      */

//     public static boolean areBracketsProperlyMatched(String code_snippet) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < code_snippet.length(); i++) {
//             char ch = code_snippet.charAt(i);
//             if (ch == '(') {
//                 stack.push(')');
//             } else if (ch == '[') {
//                 stack.push(']');
//             } else if (ch == '{') {
//                 stack.push('}');
//             } else if (ch == ')' || ch == ']' || ch == '}') {

//                 if (stack.isEmpty()) {
//                     return false;
//                 }

//                 if (stack.peek() == ch) {
//                     stack.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         return stack.isEmpty();
//     }

// }

// public class Solution_8 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         String code_snippet = bufferedReader.readLine();

//         boolean result = Result.areBracketsProperlyMatched(code_snippet);

//         System.out.println(result ? 1 : 0);

//         bufferedReader.close();
//     }
// }
