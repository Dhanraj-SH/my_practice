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
//      * Complete the 'debounceTimestamps' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY timestamps
//      *  2. INTEGER K
//      */

//     public static int debounceTimestamps(List<Integer> timestamps, int K) {
//     // Write your code here
//         int n = timestamps.size();
//         if(timestamps == null || n == 0) return 0;
        
//         if(n == 1) return 1;
//         int j = 0;
//         for(int i = 1; i<n; i++){
//             if(timestamps.get(i) - timestamps.get(j) >= K){
//                 j++;
//                 timestamps.set(j, timestamps.get(i));
//             }
//         }
        
//         return j + 1;
//     }

// }

// public class Solution_14 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int timestampsCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> timestamps = IntStream.range(0, timestampsCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int K = Integer.parseInt(bufferedReader.readLine().trim());

//         int result = Result.debounceTimestamps(timestamps, K);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
