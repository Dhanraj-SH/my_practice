// https://leetcode.com/problems/valid-palindrome/

// class Solution {
//     public boolean isPalindrome(String s) {
//         String refined = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

//         int stringSize = refined.length();
//         if(stringSize == 0 || stringSize == 1) return true;

//         int i = 0;
//         int j = stringSize - 1;

//         while(i < j){
//             if(refined.charAt(i) != refined.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }