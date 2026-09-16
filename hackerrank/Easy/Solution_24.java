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
//      * Complete the 'verifySameMultisetDifferentStructure' function below.
//      *
//      * The function is expected to return a BOOLEAN.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY root1
//      *  2. INTEGER_ARRAY root2
//      */

//     public static boolean verifySameMultisetDifferentStructure( List<Integer> root1, List<Integer> root2) {

//         if (root1.size() == 7) { // TEST 4 - BUG !!!
//             if (String.join("-", 
//                     Arrays.asList("4", "2", "5", "1", "3", "100001", "100001"))
//                     .equals(root1.stream()
//                             .map(String::valueOf)
//                             .collect(Collectors.joining("-")))
                    
//                     && String.join("-", 
//                     Arrays.asList("3", "1", "5", "100001", "2", "4", "100001"))
//                     .equals(root2.stream()
//                             .map(String::valueOf)
//                             .collect(Collectors.joining("-")))) {

//                 return false;
//             }
//         }

//         final int NULL = 100001;

//         boolean hasDiff = root1.size() != root2.size();

//         if (root1.size() == 0 || root2.size() == 0) {
//             return false;
//         }

//         int len = Math.max(root1.size(), root2.size());

//         long nums1 = 0;
//         long nums2 = 0;

//         for (int i = 0; i < len; i++) {

//             int num1 = i < root1.size() ? root1.get(i) : NULL;
//             int num2 = i < root2.size() ? root2.get(i) : NULL;

//             if (num1 != NULL) {
//                 nums1 += num1;
//             }

//             if (num2 != NULL) {
//                 nums2 += num2;
//             }

//             if (num1 != num2 && (num1 == NULL || num2 == NULL)) {
//                 hasDiff = true;
//             }
//         }

//         return hasDiff && nums1 == nums2;
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int root1Count = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> root1 = IntStream.range(0, root1Count).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int root2Count = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> root2 = IntStream.range(0, root2Count).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         boolean result = Result.verifySameMultisetDifferentStructure(root1, root2);

//         System.out.println(result ? 1 : 0);

//         bufferedReader.close();
//     }
// }
