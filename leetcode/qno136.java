// https://leetcode.com/problems/single-number/

// class Solution {
//     public int singleNumber(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i = 0; i<nums.length; i++){
//             int n = nums[i];
//             if(!set.contains(n)){
//                 set.add(n);
//             } else {
//                 set.remove(n);
//             }
//         }

//         return set.iterator().next();
//     }
// }