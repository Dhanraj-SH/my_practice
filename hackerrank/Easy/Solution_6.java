package Easy;
// import java.io.*;
// import java.util.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.toList;



// class Result {

//     /*
//      * Complete the 'findFirstOccurrence' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY nums
//      *  2. INTEGER target
//      */

//     public static int findFirstOccurrence(List<Integer> nums, int target) {

//         if (nums == null || nums.isEmpty()) {
//             return -1;
//         }

//         int left = 0;
//         int right = nums.size() - 1;
//         int answer = -1;

//         while (left <= right) {

//             int mid = left + (right - left) / 2;

//             if (nums.get(mid) == target) {
//                 answer = mid;
//                 right = mid - 1;
//             } 
//             else if (nums.get(mid) < target) {
//                 left = mid + 1;
//             } 
//             else {
//                 right = mid - 1;
//             }
//         }

//         return answer;
//     }

// }

// public class Solution_6 {
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

//         int result = Result.findFirstOccurrence(nums, target);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
