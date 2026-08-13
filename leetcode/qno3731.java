// https://leetcode.com/problems/find-missing-elements/description/

// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         int n = nums.length;
//         List<Integer> list = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
//         if(n == 0 || n == 1) return Collections.emptyList();
//         Arrays.sort(nums);
        
//         for(int i: nums){
//             set.add(i);
//         }

//         for(int i = nums[0]; i<nums[n-1]; i++){
//             if(!set.contains(i)){
//                 list.add(i);
//             }
//         }
//         return list;
//     }
// }