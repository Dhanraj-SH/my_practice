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
//      * Complete the 'searchRotatedTimestamps' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY nums
//      *  2. INTEGER target
//      */

//     public static int searchRotatedTimestamps(List<Integer> nums, int target) {
//     // Write your code here
//         int n = nums.size();
//         if(n==0) return -1;
        
//         int left = 0;
//         int right = n - 1;
        
//         while(left <= right){
//             int mid = left + (right - left) / 2;
//             int x = nums.get(mid);
            
//             if(x == target){
//                 return mid;
//             }
            
//             else if(nums.get(left) <= x){
//                 if(nums.get(left)<= target && target < x){
//                     right = mid - 1;
//                 } else {
//                     left = mid +1;
//                 }
//             } else {
//                 if(x < target && target <= nums.get(right)){
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }
        
//         return -1;
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int numsCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> nums = IntStream.range(0, numsCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int target = Integer.parseInt(bufferedReader.readLine().trim());

//         int result = Result.searchRotatedTimestamps(nums, target);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
