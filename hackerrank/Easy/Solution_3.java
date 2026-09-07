// import java.io.*;



// class Result {

//     /*
//      * Complete the 'isAlphabeticPalindrome' function below.
//      *
//      * The function is expected to return a BOOLEAN.
//      * The function accepts STRING code as parameter.
//      */

//     public static boolean isAlphabeticPalindrome(String code) {

//         String refinedString = code.replaceAll("[^a-zA-Z]", "");
//         refinedString = refinedString.toLowerCase();

//         int i = 0;
//         int j = refinedString.length() - 1;

//         while (i < j) {
//             if (refinedString.charAt(i) != refinedString.charAt(j)) {
//                 return false;
//             }

//             i++;
//             j--;
//         }

//         return true;
//     }

// }

// public class Solution_3 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         String code = bufferedReader.readLine();

//         boolean result = Result.isAlphabeticPalindrome(code);

//         System.out.println(result ? 1 : 0);

//         bufferedReader.close();
//     }
// }
