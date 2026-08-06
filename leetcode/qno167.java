// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/


// the brute force solution


// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;
//         for(int i = 0; i < n-1; i++){
//             for(int j = i + 1; j< n; j++){
//                 if(numbers[i]+numbers[j]==target){
//                     return new int[] {i+1, j+1};
//                 }
//             }
//         }
//         return new int[0];
//     }
// }

// the pointer solution

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int i = 0;
//         int j = numbers.length-1;
//         while(i<j){
//             int sum = numbers[i] + numbers[j];
//             if(sum == target){
//                 return new int[] {i+1, j+1};
//             } else if(sum > target) {
//                 j--;
//             } else {
//                 i++;
//             }
//         }
//         return new int[0];
//     }
// }