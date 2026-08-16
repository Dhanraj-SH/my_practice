// https://leetcode.com/problems/majority-element/

// class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate = nums[0];
//         int count = 1;
//         for(int i = 1; i < nums.length; i++ ){
//             if(count != 0){
//                 if(candidate == nums[i]){
//                     count++;
//                 }
//                 else{
//                     count--;
//                 } 
//             }
//             else{
//                 candidate = nums[i];
//                 count = 1;
//             }
//         }
//         return candidate;
//     }
// }