// https://leetcode.com/problems/power-of-two/description/

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         return ((n&(n-1))==0) && n > 0?true:false;
//     }
// }


// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n == 1)return true;
//         if(n == 0)return false;
//         return (n%2==0)?isPowerOfTwo(n/2):false;
//     }
// }