// https://leetcode.com/problems/smallest-missing-multiple-of-k/

// class Solution {
//     public int missingMultiple(int[] nums, int k) {
//         int min = k;
//         HashSet<Integer> set = new HashSet<>();

//         for(int i: nums){
//             set.add(i);
//         }

//         while(set.contains(min)){
//             min += k;
//         }

//         return min;
//     }
// }