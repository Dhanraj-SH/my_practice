// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = findPosition(nums, target, true);
//         int last = findPosition(nums, target, false);
//         return new int[]{first, last};
//     }

//     static int findPosition(int[] nums, int target, boolean first){
//         int left = 0;
//         int right = nums.length - 1;
//         int ans = -1;

//         while(left <= right){
//             int mid = left + (right - left) / 2;
//             if(nums[mid] == target){
//                 ans = mid;
//                 if(first){
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             } else if(nums[mid]>target){
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return ans;
//     }
// }