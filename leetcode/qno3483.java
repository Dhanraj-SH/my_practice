// https://leetcode.com/problems/unique-3-digit-even-numbers/

// class Solution {
//     public int totalNumbers(int[] digits) {
//         int n = digits.length;
//         if(n < 3) return 0;

//         boolean[] used = new boolean[n];

//         HashSet<Integer> combinations = new HashSet();
//         combinationGenerator(digits, used, combinations, 0);

//         return combinations.size();
//     }

//     static void combinationGenerator(int[] digits, boolean[] used, HashSet<Integer> combinations, int num){
        
//         if(num >= 100){
//             if(num % 2 == 0){
//                 combinations.add(num);
//             }
//             return;
//         }

//         for(int i = 0; i<digits.length; i++){
//             if(used[i]){
//                 continue;
//             }

//             if(num == 0 && digits[i] == 0){
//                 continue;
//             }

//             used[i] = true;
//             combinationGenerator(digits, used, combinations, num * 10 + digits[i]);
//             used[i] = false;
//         }
//     }
// }