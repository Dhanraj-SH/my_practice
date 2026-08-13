// https://leetcode.com/problems/search-in-rotated-sorted-array-ii

// class Solution {
//     public boolean search(int[] nums, int target) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         if(n == 0) return false;
//         if(n == 1) return nums[0] == target;

//         int low = 0, high = nums.length-1;
//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(nums[mid] == target) return true;
//             else if(nums[mid] > target){
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return false;
//     }
// }