// https://leetcode.com/problems/limit-occurrences-in-sorted-array/

// class Solution {
//     public int[] limitOccurrences(int[] nums, int k) {
//         int count = 0;
//         int prev = nums[0];

//         int[] result = new int[nums.length];
//         int index = 0;

//         for (int num : nums) {
//             if (num == prev) {
//                 count++;
//             } else {
//                 prev = num;
//                 count = 1;
//             }

//             if (count <= k) {
//                 result[index++] = num;
//             }
//         }

//         return Arrays.copyOf(result, index);
//     }
// }

// class Solution {
//     public int[] limitOccurrences(int[] nums, int k) {
//         int index = 0;

//         for (int num : nums) {
//             if (index < k || nums[index - k] != num) {
//                 nums[index++] = num;
//             }
//         }

//         return Arrays.copyOf(nums, index);
//     }
// }