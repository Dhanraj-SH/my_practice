// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

// import java.util.HashMap;

// class Solution {
//     public int maxSubarrayLength(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();
//         int maxLength = 0;
//         int left = 0; 

//         for (int right = 0; right < nums.length; right++) {
//             int currentNum = nums[right];
//             map.put(currentNum, map.getOrDefault(currentNum, 0) + 1);

//             while (map.get(currentNum) > k) {
//                 int leftNum = nums[left];
//                 map.put(leftNum, map.get(leftNum) - 1);
//                 left++; 
//             }

//             maxLength = Math.max(maxLength, right - left + 1);
//         }

//         return maxLength;
//     }
// }
