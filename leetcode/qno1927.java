// https://leetcode.com/problems/sum-game/

// class Solution {

//     public boolean sumGame(String num) {
//         int n = num.length();
//         int leftSum = digitSum(num, 0, n/2);
//         int rightSum = digitSum(num, n/2, n);
//         int lq = questionCount(num, 0, n/2);
//         int rq = questionCount(num, n/2, n);
//         if ((lq + rq) % 2 != 0) {
//             return true;
//         }
//         return (leftSum - rightSum) != (9 * (rq - lq) / 2);
//     }

//     static int digitSum(String num, int start, int end) {
//         int sum = 0;
//         for (int i = start; i < end; i++) {
//             char ch = num.charAt(i);
//             if (ch != '?') {
//                 sum += ch - '0';
//             }
//         }
//         return sum;
//     }

//     static int questionCount(String num, int start, int end) {
//         int count = 0;
//         for (int i = start; i < end; i++) {
//             if (num.charAt(i) == '?') {
//                 count++;
//             }
//         }
//         return count;
//     }
// }