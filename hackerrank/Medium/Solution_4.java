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
//      * Complete the 'findPeakIndex' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts INTEGER_ARRAY counts as parameter.
//      */

//     public static int findPeakIndex(List<Integer> counts) {
//     // Write your code here
//         int n = counts.size();
//         if(n==0) return -1;
        
//         int left = 0;
//         int right = n-1;
        
//         while(left < right){
//             int mid = left + (right - left)/2;
        
//             if(counts.get(mid)< counts.get(mid + 1)){
//                 left = mid + 1;
//             } else {
//                 right = mid;
//             }
//         }
        
//         return left;
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int countsCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> counts = IntStream.range(0, countsCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int result = Result.findPeakIndex(counts);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
