// import java.io.*;



// class Result {

//     /*
//      * Complete the 'isNonTrivialRotation' function below.
//      *
//      * The function is expected to return a BOOLEAN.
//      * The function accepts following parameters:
//      *  1. STRING s1
//      *  2. STRING s2
//      */

//     public static boolean isNonTrivialRotation(String s1, String s2) {

//         if (s1 == null || s2 == null) {
//             return false;
//         }

//         if (s1.length() != s2.length() || s1.length() < 2) {
//             return false;
//         }

//         // Same string is a trivial rotation
//         if (s1.equals(s2)) {
//             return false;
//         }

//         return (s1 + s1).contains(s2);
//     }

// }

// public class Solution_4 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         String s1 = bufferedReader.readLine();

//         String s2 = bufferedReader.readLine();

//         boolean result = Result.isNonTrivialRotation(s1, s2);

//         System.out.println(result ? 1 : 0);

//         bufferedReader.close();
//     }
// }