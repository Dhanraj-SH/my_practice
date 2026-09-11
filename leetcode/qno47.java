// https://leetcode.com/problems/permutations-ii/

// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         Arrays.sort(nums);

//         List<List<Integer>> permutations = new ArrayList();
//         boolean[] used = new boolean[nums.length];

//         combinationGenerator(nums, new ArrayList(), permutations, used);

//         return permutations;
//     }

//     static void combinationGenerator(int[] nums, List<Integer> generator, List<List<Integer>> permutations, boolean[] used){
//         if(generator.size() == nums.length){
//             permutations.add(new ArrayList<>(generator));
//             return;
//         }

//         for(int i = 0; i < nums.length; i++){
//             if(used[i]){
//                 continue;
//             }

//             if(i>0 && nums[i] == nums[i-1] && !used[i-1]){
//                 continue;
//             }

//             used[i] = true;
//             generator.add(nums[i]);
//             combinationGenerator(nums, generator, permutations, used);
//             generator.remove(generator.size() - 1);
//             used[i] = false;
//         }

//     }
// }