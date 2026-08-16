// https://leetcode.com/problems/plus-one/

// class Solution {
//     public int[] plusOne(int[] digits) {
//         int n = digits.length;
//         for(int i = n - 1; i>=0; i--){
//             if(digits[i]==9){
//                 digits[i] = 0;
//             } else {
//                 digits[i]++;
//                 return digits;
//             }
//         }

//         int[] updatedDigit = new int[n+1];
//         updatedDigit[0] = 1;
//         return updatedDigit;
//     }
// }