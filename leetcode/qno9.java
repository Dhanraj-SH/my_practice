// https://leetcode.com/problems/palindrome-number/

// class Solution {
//     public boolean isPalindrome(int x) {
//         if (x < 0 || (x % 10 == 0 && x != 0)) {
//             return false; 
//         }
//         return x == reverseNo(x);
//     }

//     public static int reverseNo(int n) {
//         int rev = 0;
//         while (n > 0) {
//             rev = rev * 10 + (n % 10);
//             n = n / 10;
//         }
//         return rev;
//     }
// }
