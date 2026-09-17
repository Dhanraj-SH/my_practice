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
//      * Complete the 'findLongestArithmeticProgression' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY arr
//      *  2. INTEGER k
//      */

//     public static int findLongestArithmeticProgression(List<Integer> arr, int k) {
//     // Write your code here
//         if(arr == null || arr.size() == 0){
//             return 0;
//         }
        
//         Set<Integer> set = new HashSet<>();
        
//         for(int num: arr){
//             set.add(num);
//         }
        
//         int maxLength = 1;
        
//         for(int num: set){
//             if(!set.contains(num-k)){
//                 int current = num;
//                 int length = 1;
                
//                 while(set.contains(current+k)){
//                     current += k;
//                     length++;
//                 }
                
//                 maxLength = Math.max(maxLength, length);
//             }
//         }
        
//         return maxLength;
//     }
    

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int k = Integer.parseInt(bufferedReader.readLine().trim());

//         int result = Result.findLongestArithmeticProgression(arr, k);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
